package typingsJapgolly.blueprintjsCore

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.blueprintjsCore.anon.AllowInInput
import typingsJapgolly.blueprintjsCore.anon.DisplayName
import typingsJapgolly.blueprintjsCore.anon.PartialIHotkeysDialogProp
import typingsJapgolly.blueprintjsCore.anon.TabIndex
import typingsJapgolly.blueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeyMod.IHotkeyProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysDialog2Mod.HotkeysDialog2Props
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysTarget2Mod.HotkeysTarget2Props
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysTypesMod.IHotkeysProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysKeyComboMod.KeyComboTagProps
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmComponentsHotkeysMod {
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkey")
  @js.native
  open class Hotkey protected ()
    extends typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeyMod.Hotkey {
    def this(props: IHotkeyProps) = this()
    def this(props: IHotkeyProps, context: Any) = this()
  }
  /* static members */
  object Hotkey {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkey")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkey.defaultProps")
    @js.native
    def defaultProps: AllowInInput = js.native
    inline def defaultProps_=(x: AllowInInput): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkey.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkeys")
  @js.native
  open class Hotkeys protected ()
    extends typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysMod.Hotkeys {
    def this(props: IHotkeysProps) = this()
    def this(props: IHotkeysProps, context: Any) = this()
  }
  /* static members */
  object Hotkeys {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkeys")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkeys.defaultProps")
    @js.native
    def defaultProps: TabIndex = js.native
    inline def defaultProps_=(x: TabIndex): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "Hotkeys.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "HotkeysDialog2")
  @js.native
  val HotkeysDialog2: FC[HotkeysDialog2Props] = js.native
  
  inline def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): DisplayName & T = ^.asInstanceOf[js.Dynamic].applyDynamic("HotkeysTarget")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[DisplayName & T]
  
  inline def HotkeysTarget2(hasChildrenHotkeysOptions: HotkeysTarget2Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HotkeysTarget2")(hasChildrenHotkeysOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "KeyCombo")
  @js.native
  open class KeyCombo protected ()
    extends typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysKeyComboMod.KeyCombo {
    def this(props: KeyComboTagProps) = this()
    def this(props: KeyComboTagProps, context: Any) = this()
  }
  /* static members */
  object KeyCombo {
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "KeyCombo")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/core/lib/esm/components/hotkeys", "KeyCombo.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  inline def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("comboMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getKeyCombo(e: KeyboardEvent): IKeyCombo = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyCombo")(e.asInstanceOf[js.Any]).asInstanceOf[IKeyCombo]
  
  inline def getKeyComboString(e: KeyboardEvent): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyComboString")(e.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hideHotkeysDialog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideHotkeysDialog")().asInstanceOf[Unit]
  
  inline def parseKeyCombo(combo: String): IKeyCombo = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyCombo")(combo.asInstanceOf[js.Any]).asInstanceOf[IKeyCombo]
  
  inline def setHotkeysDialogProps(props: PartialIHotkeysDialogProp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHotkeysDialogProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
