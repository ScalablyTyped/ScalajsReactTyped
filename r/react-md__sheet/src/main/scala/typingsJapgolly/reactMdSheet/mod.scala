package typingsJapgolly.reactMdSheet

import org.scalajs.dom.HTMLDivElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdSheet.typesSheetMod.SheetProps
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/sheet", "DEFAULT_SHEET_CLASSNAMES")
  @js.native
  val DEFAULT_SHEET_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/sheet", "DEFAULT_SHEET_TIMEOUT")
  @js.native
  val DEFAULT_SHEET_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/sheet", "Sheet")
  @js.native
  val Sheet: ForwardRefExoticComponent[SheetProps & RefAttributes[HTMLDivElement]] = js.native
}
