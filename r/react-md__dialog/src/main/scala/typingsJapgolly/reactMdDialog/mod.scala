package typingsJapgolly.reactMdDialog

import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLHeadingElement
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.reactMdDialog.typesDialogContentMod.DialogContentProps
import typingsJapgolly.reactMdDialog.typesDialogFooterMod.DialogFooterProps
import typingsJapgolly.reactMdDialog.typesDialogHeaderMod.DialogHeaderProps
import typingsJapgolly.reactMdDialog.typesDialogMod.DialogProps
import typingsJapgolly.reactMdDialog.typesDialogTitleMod.DialogTitleProps
import typingsJapgolly.reactMdDialog.typesFixedDialogMod.FixedDialogProps
import typingsJapgolly.reactMdDialog.typesNestedDialogContextMod.NestedDialogContextProviderProps
import typingsJapgolly.reactMdTransition.typesTypesMod.CSSTransitionClassNames
import typingsJapgolly.reactMdTransition.typesTypesMod.TransitionTimeout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-md/dialog", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-md/dialog", "DEFAULT_DIALOG_CLASSNAMES")
  @js.native
  val DEFAULT_DIALOG_CLASSNAMES: CSSTransitionClassNames = js.native
  
  @JSImport("@react-md/dialog", "DEFAULT_DIALOG_TIMEOUT")
  @js.native
  val DEFAULT_DIALOG_TIMEOUT: TransitionTimeout = js.native
  
  @JSImport("@react-md/dialog", "Dialog")
  @js.native
  val Dialog: ForwardRefExoticComponent[DialogProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogContent")
  @js.native
  val DialogContent: ForwardRefExoticComponent[DialogContentProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogFooter")
  @js.native
  val DialogFooter: ForwardRefExoticComponent[DialogFooterProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogHeader")
  @js.native
  val DialogHeader: ForwardRefExoticComponent[DialogHeaderProps & RefAttributes[HTMLDivElement]] = js.native
  
  @JSImport("@react-md/dialog", "DialogTitle")
  @js.native
  val DialogTitle: ForwardRefExoticComponent[DialogTitleProps & RefAttributes[HTMLHeadingElement]] = js.native
  
  @JSImport("@react-md/dialog", "FixedDialog")
  @js.native
  val FixedDialog: ForwardRefExoticComponent[FixedDialogProps & RefAttributes[HTMLDivElement]] = js.native
  
  inline def NestedDialogContextProvider(hasChildren: NestedDialogContextProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("NestedDialogContextProvider")(hasChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
}
