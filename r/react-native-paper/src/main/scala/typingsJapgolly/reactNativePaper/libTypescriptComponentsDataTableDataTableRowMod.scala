package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.Call
import typingsJapgolly.reactNativePaper.anon.CallHasOnPressStyleThemeChildrenPointerEventsRest
import typingsJapgolly.reactNativePaper.anon.ChildrenOnPress
import typingsJapgolly.reactNativePaper.anon.PickRemoveChildrenComponeAccessibilityRole
import typingsJapgolly.reactNativePaper.anon.PickTouchableWithoutFeedb
import typingsJapgolly.reactNativePaper.anon.PointerEvents
import typingsJapgolly.reactNativePaper.anon.TouchableWithoutFeedbackP
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDataTableDataTableRowMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableRow", JSImport.Default)
  @js.native
  val default: ComponentType[PickRemoveChildrenComponeAccessibilityRole] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & PointerEvents
    ]) & CallHasOnPressStyleThemeChildrenPointerEventsRest, 
    js.Object
  ]) = js.native
  
  /**
    * A component to show a single row inside of a table.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/data-table-row-cell.png" />
    *   </figure>
    * </div>
    *
    *
    * ## Usage
    * ```js
    * import * as React from 'react';
    * import { DataTable } from 'react-native-paper';
    *
    * const MyComponent = () => (
    *      <DataTable.Row>
    *        <DataTable.Cell numeric>1</DataTable.Cell>
    *        <DataTable.Cell numeric>2</DataTable.Cell>
    *        <DataTable.Cell numeric>3</DataTable.Cell>
    *        <DataTable.Cell numeric>4</DataTable.Cell>
    *      </DataTable.Row>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object DataTableRow {
    
    inline def apply(hasOnPressStyleThemeChildrenPointerEventsRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasOnPressStyleThemeChildrenPointerEventsRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableRow", "DataTableRow")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableRow", "DataTableRow.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = (RemoveChildren[
    ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
  ]) & ChildrenOnPress
  
  type _To = ComponentType[PickRemoveChildrenComponeAccessibilityRole] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & PointerEvents
    ]) & CallHasOnPressStyleThemeChildrenPointerEventsRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsDataTableDataTableRowMod.foo` */
  override def _to: ComponentType[PickRemoveChildrenComponeAccessibilityRole] & (NonReactStatics[
    (ComponentType[
      (RemoveChildren[
        ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
      ]) & PointerEvents
    ]) & CallHasOnPressStyleThemeChildrenPointerEventsRest, 
    js.Object
  ]) = default
}
