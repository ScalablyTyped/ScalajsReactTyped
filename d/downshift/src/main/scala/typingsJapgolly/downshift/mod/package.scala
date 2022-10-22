package typingsJapgolly.downshift.mod

import japgolly.scalajs.react.facade.React.Component
import japgolly.scalajs.react.facade.React.Node
import org.scalajs.dom.HTMLDivElement
import org.scalajs.dom.HTMLLabelElement
import typingsJapgolly.downshift.mod.^
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def resetIdCounter(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetIdCounter")().asInstanceOf[Unit]

inline def useCombobox: UseComboboxInterface = ^.asInstanceOf[js.Dynamic].selectDynamic("useCombobox").asInstanceOf[UseComboboxInterface]

inline def useMultipleSelection: UseMultipleSelectionInterface = ^.asInstanceOf[js.Dynamic].selectDynamic("useMultipleSelection").asInstanceOf[UseMultipleSelectionInterface]

inline def useSelect: UseSelectInterface = ^.asInstanceOf[js.Dynamic].selectDynamic("useSelect").asInstanceOf[UseSelectInterface]

type Callback = js.Function0[Unit]

type ChildrenFunction[Item] = js.Function1[/* options */ ControllerStateAndHelpers[Item], Node]

type Downshift[Item] = Component[DownshiftProps[Item] & js.Object, js.Object]

type GetLabelPropsOptions = HTMLProps[HTMLLabelElement]

type StateChangeFunction[Item] = js.Function1[/* state */ DownshiftState[Item], Partial[StateChangeOptions[Item]]]

type UseComboboxGetComboboxPropsOptions = HTMLProps[HTMLDivElement]

type UseComboboxGetLabelPropsOptions = GetLabelPropsOptions

type UseSelectGetLabelPropsOptions = GetLabelPropsOptions
