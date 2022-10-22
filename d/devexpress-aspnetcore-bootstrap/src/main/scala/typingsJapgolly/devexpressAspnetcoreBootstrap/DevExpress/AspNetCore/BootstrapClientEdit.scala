package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.gotFocus
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.lostFocus
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.validation
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.valueChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapClientEdit
  extends StObject
     with Control {
  
  def focus(): Unit = js.native
  
  def getCaption(): String = js.native
  
  def getEnabled(): Boolean = js.native
  
  def getErrorText(): String = js.native
  
  def getInputElement(): Any = js.native
  
  def getIsValid(): Boolean = js.native
  
  def getReadOnly(): Boolean = js.native
  
  def getValue(): Any = js.native
  
  def off(
    eventName: Unit,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      js.UndefOr[EditValidationEventArgs | EventArgs | ProcessingModeEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_gotFocus(eventName: gotFocus): this.type = js.native
  @JSName("off")
  def off_gotFocus(
    eventName: gotFocus,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_lostFocus(eventName: lostFocus): this.type = js.native
  @JSName("off")
  def off_lostFocus(
    eventName: lostFocus,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_validation(eventName: validation): this.type = js.native
  @JSName("off")
  def off_validation(
    eventName: validation,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditValidationEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_valueChanged(eventName: valueChanged): this.type = js.native
  @JSName("off")
  def off_valueChanged(
    eventName: valueChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_gotFocus(
    eventName: gotFocus,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_lostFocus(
    eventName: lostFocus,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_validation(
    eventName: validation,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditValidationEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_valueChanged(
    eventName: valueChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_gotFocus(
    eventName: gotFocus,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_lostFocus(
    eventName: lostFocus,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_validation(
    eventName: validation,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[EditValidationEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_valueChanged(
    eventName: valueChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  
  def setCaption(caption: String): Unit = js.native
  
  def setEnabled(value: Boolean): Unit = js.native
  
  def setErrorText(errorText: String): Unit = js.native
  
  def setIsValid(isValid: Boolean): Unit = js.native
  
  def setReadOnly(readOnly: Boolean): Unit = js.native
  
  def setValue(value: Any): Unit = js.native
  
  def validate(): Unit = js.native
}
