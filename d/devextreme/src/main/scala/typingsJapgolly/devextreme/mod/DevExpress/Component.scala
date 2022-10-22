package typingsJapgolly.devextreme.mod.DevExpress

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Component[TProperties] extends StObject {
  
  /**
    * Prevents the UI component from refreshing until the endUpdate() method is called.
    */
  def beginUpdate(): Unit = js.native
  
  /**
    * Refreshes the UI component after a call of the beginUpdate() method.
    */
  def endUpdate(): Unit = js.native
  
  /**
    * Gets the UI component&apos;s instance. Use it to access other methods of the UI component.
    */
  def instance(): this.type = js.native
  
  /**
    * Detaches all event handlers from a single event.
    */
  def off(eventName: String): this.type = js.native
  /**
    * Detaches a particular event handler from a single event.
    */
  def off(eventName: String, eventHandler: js.Function): this.type = js.native
  
  /**
    * Subscribes to an event.
    */
  def on(eventName: String, eventHandler: js.Function): this.type = js.native
  /**
    * Subscribes to events.
    */
  def on(events: StringDictionary[js.Function]): this.type = js.native
  
  /**
    * Gets all UI component properties.
    */
  def option(): TProperties = js.native
  /**
    * Updates the values of several properties.
    */
  def option(options: Partial[TProperties]): Unit = js.native
  /**
    * Updates the value of a single property.
    */
  def option[TPropertyName /* <: String */](
    optionName: TPropertyName,
    optionValue: /* import warning: importer.ImportType#apply Failed type conversion: TPropertyName extends keyof TProperties ? TProperties[TPropertyName] : unknown */ js.Any
  ): Unit = js.native
  /**
    * Gets the value of a single property.
    */
  @JSName("option")
  def option_TPropertyName_Any[TPropertyName /* <: String */](optionName: TPropertyName): /* import warning: importer.ImportType#apply Failed type conversion: TPropertyName extends keyof TProperties ? TProperties[TPropertyName] : unknown */ js.Any = js.native
  
  /**
    * Resets a property to its default value.
    */
  def resetOption(optionName: String): Unit = js.native
}
