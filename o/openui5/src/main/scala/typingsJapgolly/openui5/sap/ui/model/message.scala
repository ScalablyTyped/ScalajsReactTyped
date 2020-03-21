package typingsJapgolly.openui5.sap.ui.model

import typingsJapgolly.openui5.sap.ui.core.message.MessageManager
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("sap.ui.model.message")
@js.native
object message extends js.Object {
  @js.native
  class MessageModel protected () extends ClientModel {
    /**
      * Constructor for a new JSONModel.
      * @param oMessageManager The MessageManager instance
      */
    def this(oMessageManager: MessageManager) = this()
    /**
      * Sets the message data to the model.
      * @param oData the data to set on the model
      */
    def setData(oData: js.Any): Unit = js.native
    /**
      * Sets a new value for the given property <code>sPropertyName</code> in the model.If the model value
      * changed all interested parties are informed.
      * @param sPath path of the property to set
      * @param oValue value to set the property to
      * @param oContext the context which will be used to set the property
      */
    def setProperty(sPath: String, oValue: js.Any): Unit = js.native
    def setProperty(sPath: String, oValue: js.Any, oContext: js.Any): Unit = js.native
  }
  
}

