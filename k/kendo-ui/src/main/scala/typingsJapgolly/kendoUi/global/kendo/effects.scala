package typingsJapgolly.kendoUi.global.kendo

import typingsJapgolly.kendoUi.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object effects {
  
  @JSGlobal("kendo.effects")
  @js.native
  val ^ : js.Any = js.native
  
  inline def box(element: HTMLElement): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("box")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
  
  inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
  
  inline def fillScale(firstElement: HTMLElement, secondElement: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fillScale")(firstElement.asInstanceOf[js.Any], secondElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def fitScale(firstElement: HTMLElement, secondElement: HTMLElement): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("fitScale")(firstElement.asInstanceOf[js.Any], secondElement.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def transformOrigin(firstElement: HTMLElement, secondElement: HTMLElement): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("transformOrigin")(firstElement.asInstanceOf[js.Any], secondElement.asInstanceOf[js.Any])).asInstanceOf[Any]
}
