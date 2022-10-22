package typingsJapgolly.baseui

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.baseui.anon.PartialToastProps
import typingsJapgolly.baseui.anon.sizenumberstringcolorstri
import typingsJapgolly.baseui.baseuiStrings.div
import typingsJapgolly.baseui.baseuiStrings.svg
import typingsJapgolly.baseui.toastToastMod.default
import typingsJapgolly.baseui.toastTypesMod.SharedStylePropsArg
import typingsJapgolly.baseui.toastTypesMod.ToastProps
import typingsJapgolly.baseui.toastTypesMod.ToastPropsShape
import typingsJapgolly.baseui.toastTypesMod.ToasterProps
import typingsJapgolly.baseui.toastTypesMod.ToasterSharedStylePropsArg
import typingsJapgolly.react.mod.Key
import typingsJapgolly.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toastMod {
  
  /* Inlined std.Readonly<{ readonly info :'info',  readonly positive :'positive',  readonly warning :'warning',  readonly negative :'negative'}> */
  object KIND {
    
    @JSImport("baseui/toast", "KIND.info")
    @js.native
    val info: typingsJapgolly.baseui.baseuiStrings.info = js.native
    
    @JSImport("baseui/toast", "KIND.negative")
    @js.native
    val negative: typingsJapgolly.baseui.baseuiStrings.negative = js.native
    
    @JSImport("baseui/toast", "KIND.positive")
    @js.native
    val positive: typingsJapgolly.baseui.baseuiStrings.positive = js.native
    
    @JSImport("baseui/toast", "KIND.warning")
    @js.native
    val warning: typingsJapgolly.baseui.baseuiStrings.warning = js.native
  }
  
  /* Inlined std.Readonly<{ readonly topLeft :'topLeft',  readonly top :'top',  readonly topRight :'topRight',  readonly bottomRight :'bottomRight',  readonly bottom :'bottom',  readonly bottomLeft :'bottomLeft'}> */
  object PLACEMENT {
    
    @JSImport("baseui/toast", "PLACEMENT.bottom")
    @js.native
    val bottom: typingsJapgolly.baseui.baseuiStrings.bottom = js.native
    
    @JSImport("baseui/toast", "PLACEMENT.bottomLeft")
    @js.native
    val bottomLeft: typingsJapgolly.baseui.baseuiStrings.bottomLeft = js.native
    
    @JSImport("baseui/toast", "PLACEMENT.bottomRight")
    @js.native
    val bottomRight: typingsJapgolly.baseui.baseuiStrings.bottomRight = js.native
    
    @JSImport("baseui/toast", "PLACEMENT.top")
    @js.native
    val top: typingsJapgolly.baseui.baseuiStrings.top = js.native
    
    @JSImport("baseui/toast", "PLACEMENT.topLeft")
    @js.native
    val topLeft: typingsJapgolly.baseui.baseuiStrings.topLeft = js.native
    
    @JSImport("baseui/toast", "PLACEMENT.topRight")
    @js.native
    val topRight: typingsJapgolly.baseui.baseuiStrings.topRight = js.native
  }
  
  @JSImport("baseui/toast", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[div, SharedStylePropsArg] = js.native
  
  @JSImport("baseui/toast", "StyledCloseIcon")
  @js.native
  val StyledCloseIcon: StyletronComponent[svg, sizenumberstringcolorstri] = js.native
  
  @JSImport("baseui/toast", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, ToasterSharedStylePropsArg] = js.native
  
  /* Inlined std.Readonly<{ readonly inline :'inline',  readonly toast :'toast'}> */
  object TYPE {
    
    @JSImport("baseui/toast", "TYPE.inline")
    @js.native
    val `inline`: typingsJapgolly.baseui.baseuiStrings.`inline` = js.native
    
    @JSImport("baseui/toast", "TYPE.toast")
    @js.native
    val toast: typingsJapgolly.baseui.baseuiStrings.toast = js.native
  }
  
  @JSImport("baseui/toast", "Toast")
  @js.native
  open class Toast protected () extends default {
    def this(props: ToastProps) = this()
  }
  object Toast {
    
    @JSImport("baseui/toast", "Toast")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("baseui/toast", "Toast.defaultProps")
    @js.native
    def defaultProps: ToastPropsShape = js.native
    inline def defaultProps_=(x: ToastPropsShape): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("baseui/toast", "ToasterContainer")
  @js.native
  open class ToasterContainer protected ()
    extends typingsJapgolly.baseui.toastToasterMod.ToasterContainer {
    def this(props: ToasterProps) = this()
  }
  /* static members */
  object ToasterContainer {
    
    @JSImport("baseui/toast", "ToasterContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("baseui/toast", "ToasterContainer.defaultProps")
    @js.native
    def defaultProps: ToasterProps = js.native
    inline def defaultProps_=(x: ToasterProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  object toaster {
    
    @JSImport("baseui/toast", "toaster")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    inline def clear(key: Key): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def getRef(): js.UndefOr[typingsJapgolly.baseui.toastToasterMod.ToasterContainer] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRef")().asInstanceOf[js.UndefOr[typingsJapgolly.baseui.toastToasterMod.ToasterContainer]]
    
    inline def info(children: Node): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def info(children: Node, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("info")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    inline def negative(children: Node): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("negative")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def negative(children: Node, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("negative")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    inline def positive(children: Node): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("positive")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def positive(children: Node, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("positive")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
    
    inline def show(children: Node): js.UndefOr[Key | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("show")(children.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Key | Null]]
    inline def show(children: Node, props: ToastPropsShape): js.UndefOr[Key | Null] = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Key | Null]]
    
    inline def update(key: Key, props: PartialToastProps): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(key.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def warning(children: Node): Key = ^.asInstanceOf[js.Dynamic].applyDynamic("warning")(children.asInstanceOf[js.Any]).asInstanceOf[Key]
    inline def warning(children: Node, props: ToastPropsShape): Key = (^.asInstanceOf[js.Dynamic].applyDynamic("warning")(children.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Key]
  }
  
  @js.native
  trait IToaster extends StObject {
    
    def clear(): Unit = js.native
    def clear(key: Key): Unit = js.native
    
    def getRef(): js.UndefOr[typingsJapgolly.baseui.toastToasterMod.ToasterContainer] = js.native
    
    def info(children: Node): Key = js.native
    def info(children: Node, props: ToastPropsShape): Key = js.native
    
    def negative(children: Node): Key = js.native
    def negative(children: Node, props: ToastPropsShape): Key = js.native
    
    def positive(children: Node): Key = js.native
    def positive(children: Node, props: ToastPropsShape): Key = js.native
    
    def show(children: Node): js.UndefOr[Key | Null] = js.native
    def show(children: Node, props: ToastPropsShape): js.UndefOr[Key | Null] = js.native
    
    def update(key: Key, props: PartialToastProps): Unit = js.native
    
    def warning(children: Node): Key = js.native
    def warning(children: Node, props: ToastPropsShape): Key = js.native
  }
}
