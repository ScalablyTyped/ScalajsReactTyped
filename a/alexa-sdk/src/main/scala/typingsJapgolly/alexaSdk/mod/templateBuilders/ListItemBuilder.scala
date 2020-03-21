package typingsJapgolly.alexaSdk.mod.templateBuilders

import typingsJapgolly.alexaSdk.mod.Image
import typingsJapgolly.alexaSdk.mod.ListItem
import typingsJapgolly.alexaSdk.mod.TextField
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to build a list of ListItems for ListTemplate
  */
@JSImport("alexa-sdk", "templateBuilders.ListItemBuilder")
@js.native
class ListItemBuilder () extends js.Object {
  var items: js.Array[ListItem] = js.native
  /**
    * Add an item to the list of template
    * @param image image
    * @param token token
    * @param primaryText primaryText
    * @param secondaryText secondaryText
    * @param tertiaryText tertiaryText
    */
  def addItem(image: Image, token: String, primaryText: TextField): ListItemBuilder = js.native
  def addItem(image: Image, token: String, primaryText: TextField, secondaryText: TextField): ListItemBuilder = js.native
  def addItem(
    image: Image,
    token: String,
    primaryText: TextField,
    secondaryText: TextField,
    tertiaryText: TextField
  ): ListItemBuilder = js.native
  def build(): js.Array[ListItem] = js.native
}

