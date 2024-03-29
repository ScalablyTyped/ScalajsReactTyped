package typingsJapgolly.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.checkedChanged
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.click
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.gotFocus
import typingsJapgolly.devexpressAspnetcoreBootstrap.devexpressAspnetcoreBootstrapStrings.lostFocus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapButton
  extends StObject
     with Control {
  
  def doClick(): Unit = js.native
  
  def focus(): Unit = js.native
  
  def getBadgeIconCssClass(): String = js.native
  
  def getBadgeText(): String = js.native
  
  def getChecked(): Boolean = js.native
  
  def getEnabled(): Boolean = js.native
  
  def getImageUrl(): String = js.native
  
  def getText(): String = js.native
  
  def off(
    eventName: Unit,
    callback: js.ThisFunction1[
      /* this */ this.type, 
      js.UndefOr[ButtonClickEventArgs | EventArgs | ProcessingModeEventArgs], 
      Unit
    ]
  ): this.type = js.native
  @JSName("off")
  def off_checkedChanged(eventName: checkedChanged): this.type = js.native
  @JSName("off")
  def off_checkedChanged(
    eventName: checkedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_click(eventName: click): this.type = js.native
  @JSName("off")
  def off_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonClickEventArgs], Unit]
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
  
  @JSName("on")
  def on_checkedChanged(
    eventName: checkedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonClickEventArgs], Unit]
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
  
  @JSName("once")
  def once_checkedChanged(
    eventName: checkedChanged,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ProcessingModeEventArgs], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_click(
    eventName: click,
    callback: js.ThisFunction1[/* this */ this.type, /* args */ js.UndefOr[ButtonClickEventArgs], Unit]
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
  
  def setBadgeIconCssClass(cssClass: String): Unit = js.native
  
  def setBadgeText(text: String): Unit = js.native
  
  def setChecked(value: Boolean): Unit = js.native
  
  def setEnabled(value: Boolean): Unit = js.native
  
  def setImageUrl(value: String): Unit = js.native
  
  def setText(value: String): Unit = js.native
}
