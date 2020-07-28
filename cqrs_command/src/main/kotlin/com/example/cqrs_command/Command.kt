package com.example.cqrs_command

import io.eventuate.tram.commands.common.Command

class ReserveStoreProductCommand(var productId: String) : Command

class CreateDeliveryCommand(var order: String) : Command