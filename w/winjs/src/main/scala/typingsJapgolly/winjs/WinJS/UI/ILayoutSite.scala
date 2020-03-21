package typingsJapgolly.winjs.WinJS.UI

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use the ILayoutSite2 interface. Represents a rendering site for an ILayout.
  **/
trait ILayoutSite extends js.Object {
  //#region Properties
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var animationsDisabled: Boolean
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var itemSurface: HTMLElement
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var rtl: Boolean
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var scrollbarPos: Double
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var surface: HTMLElement
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewport: HTMLElement
  /**
    * This API is no longer supported. Starting with the Windows Library for JavaScript 2.0 Preview, use a the ILayoutSite2 interface.
    **/
  var viewportSize: js.Any
}

object ILayoutSite {
  @scala.inline
  def apply(
    animationsDisabled: Boolean,
    itemSurface: HTMLElement,
    rtl: Boolean,
    scrollbarPos: Double,
    surface: HTMLElement,
    viewport: HTMLElement,
    viewportSize: js.Any
  ): ILayoutSite = {
    val __obj = js.Dynamic.literal(animationsDisabled = animationsDisabled.asInstanceOf[js.Any], itemSurface = itemSurface.asInstanceOf[js.Any], rtl = rtl.asInstanceOf[js.Any], scrollbarPos = scrollbarPos.asInstanceOf[js.Any], surface = surface.asInstanceOf[js.Any], viewport = viewport.asInstanceOf[js.Any], viewportSize = viewportSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ILayoutSite]
  }
}

