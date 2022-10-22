package typingsJapgolly.blueprintjsCore.libEsmComponentsMod

import org.scalajs.dom.KeyboardEvent
import typingsJapgolly.blueprintjsCore.anon.DisplayName
import typingsJapgolly.blueprintjsCore.anon.HTMLPropsHTMLElementIElem
import typingsJapgolly.blueprintjsCore.anon.HTMLPropsHTMLHeadingEleme
import typingsJapgolly.blueprintjsCore.anon.HTMLPropsHTMLLabelElement
import typingsJapgolly.blueprintjsCore.anon.HTMLPropsHTMLOListElement
import typingsJapgolly.blueprintjsCore.anon.HTMLPropsHTMLUListElement
import typingsJapgolly.blueprintjsCore.anon.Instantiable
import typingsJapgolly.blueprintjsCore.anon.PartialIHotkeysDialogProp
import typingsJapgolly.blueprintjsCore.libEsmCommonConstructorMod.IConstructor
import typingsJapgolly.blueprintjsCore.libEsmComponentsBreadcrumbsBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.blueprintjsCore.libEsmComponentsContextMenuContextMenuTargetMod.IContextMenuTargetComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysDialog2Mod.HotkeysDialog2Props
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysTarget2Mod.HotkeysTarget2Props
import typingsJapgolly.blueprintjsCore.libEsmComponentsHotkeysHotkeysTargetMod.IHotkeysTargetComponent
import typingsJapgolly.blueprintjsCore.libEsmComponentsMod.^
import typingsJapgolly.blueprintjsCore.libEsmComponentsPanelStack2PanelStack2Mod.PanelStack2Component
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Blockquote: FC[HTMLPropsHTMLElementIElem] = ^.asInstanceOf[js.Dynamic].selectDynamic("Blockquote").asInstanceOf[FC[HTMLPropsHTMLElementIElem]]

inline def Breadcrumb: FC[BreadcrumbProps] = ^.asInstanceOf[js.Dynamic].selectDynamic("Breadcrumb").asInstanceOf[FC[BreadcrumbProps]]

inline def Code: FC[HTMLPropsHTMLElementIElem] = ^.asInstanceOf[js.Dynamic].selectDynamic("Code").asInstanceOf[FC[HTMLPropsHTMLElementIElem]]

inline def ContextMenuTarget[T /* <: IConstructor[IContextMenuTargetComponent] */](WrappedComponent: T): Instantiable & T = ^.asInstanceOf[js.Dynamic].applyDynamic("ContextMenuTarget")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[Instantiable & T]

inline def Expander: FC[js.Object] = ^.asInstanceOf[js.Dynamic].selectDynamic("Expander").asInstanceOf[FC[js.Object]]

inline def H1: FC[HTMLPropsHTMLHeadingEleme] = ^.asInstanceOf[js.Dynamic].selectDynamic("H1").asInstanceOf[FC[HTMLPropsHTMLHeadingEleme]]

inline def H2: FC[HTMLPropsHTMLHeadingEleme] = ^.asInstanceOf[js.Dynamic].selectDynamic("H2").asInstanceOf[FC[HTMLPropsHTMLHeadingEleme]]

inline def H3: FC[HTMLPropsHTMLHeadingEleme] = ^.asInstanceOf[js.Dynamic].selectDynamic("H3").asInstanceOf[FC[HTMLPropsHTMLHeadingEleme]]

inline def H4: FC[HTMLPropsHTMLHeadingEleme] = ^.asInstanceOf[js.Dynamic].selectDynamic("H4").asInstanceOf[FC[HTMLPropsHTMLHeadingEleme]]

inline def H5: FC[HTMLPropsHTMLHeadingEleme] = ^.asInstanceOf[js.Dynamic].selectDynamic("H5").asInstanceOf[FC[HTMLPropsHTMLHeadingEleme]]

inline def H6: FC[HTMLPropsHTMLHeadingEleme] = ^.asInstanceOf[js.Dynamic].selectDynamic("H6").asInstanceOf[FC[HTMLPropsHTMLHeadingEleme]]

inline def HotkeysDialog2: FC[HotkeysDialog2Props] = ^.asInstanceOf[js.Dynamic].selectDynamic("HotkeysDialog2").asInstanceOf[FC[HotkeysDialog2Props]]

inline def HotkeysTarget[T /* <: IConstructor[IHotkeysTargetComponent] */](WrappedComponent: T): DisplayName & T = ^.asInstanceOf[js.Dynamic].applyDynamic("HotkeysTarget")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[DisplayName & T]

inline def HotkeysTarget2(hasChildrenHotkeysOptions: HotkeysTarget2Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("HotkeysTarget2")(hasChildrenHotkeysOptions.asInstanceOf[js.Any]).asInstanceOf[Element]

inline def Label: FC[HTMLPropsHTMLLabelElement] = ^.asInstanceOf[js.Dynamic].selectDynamic("Label").asInstanceOf[FC[HTMLPropsHTMLLabelElement]]

inline def OL: FC[HTMLPropsHTMLOListElement] = ^.asInstanceOf[js.Dynamic].selectDynamic("OL").asInstanceOf[FC[HTMLPropsHTMLOListElement]]

inline def PanelStack2: PanelStack2Component = ^.asInstanceOf[js.Dynamic].selectDynamic("PanelStack2").asInstanceOf[PanelStack2Component]

inline def Pre: FC[HTMLPropsHTMLElementIElem] = ^.asInstanceOf[js.Dynamic].selectDynamic("Pre").asInstanceOf[FC[HTMLPropsHTMLElementIElem]]

inline def UL: FC[HTMLPropsHTMLUListElement] = ^.asInstanceOf[js.Dynamic].selectDynamic("UL").asInstanceOf[FC[HTMLPropsHTMLUListElement]]

inline def comboMatches(a: IKeyCombo, b: IKeyCombo): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("comboMatches")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def getKeyCombo(e: KeyboardEvent): IKeyCombo = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyCombo")(e.asInstanceOf[js.Any]).asInstanceOf[IKeyCombo]

inline def getKeyComboString(e: KeyboardEvent): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyComboString")(e.asInstanceOf[js.Any]).asInstanceOf[String]

inline def hideHotkeysDialog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hideHotkeysDialog")().asInstanceOf[Unit]

inline def parseKeyCombo(combo: String): IKeyCombo = ^.asInstanceOf[js.Dynamic].applyDynamic("parseKeyCombo")(combo.asInstanceOf[js.Any]).asInstanceOf[IKeyCombo]

inline def setHotkeysDialogProps(props: PartialIHotkeysDialogProp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setHotkeysDialogProps")(props.asInstanceOf[js.Any]).asInstanceOf[Unit]
