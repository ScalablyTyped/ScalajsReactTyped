package typingsJapgolly.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientHtmlEditor.ActiveTabChanged event that concerns manipulations on tabs.
  */
@JSGlobal("ASPxClientHtmlEditorTabEventArgs")
@js.native
class ASPxClientHtmlEditorTabEventArgs protected () extends ASPxClientEventArgs {
  /**
    * Initializes a new object of the ASPxClientHtmlEditorTabEventArgs type with the specified setting.
    * @param name A string value that uniquely identifies the name of a tab related to the event.
    */
  def this(name: String) = this()
  /**
    * Gets the name that uniquely identifies an editor tab.
    */
  var name: String = js.native
}

