package typingsJapgolly.reactNativePaper

import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativePaper.anon.Call
import typingsJapgolly.reactNativePaper.anon.Numeric
import typingsJapgolly.reactNativePaper.anon.PickTouchableWithoutFeedb
import typingsJapgolly.reactNativePaper.anon.TouchableWithoutFeedbackP
import typingsJapgolly.reactNativePaper.libTypescriptTypesMod.RemoveChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDataTableDataTableCellMod {
  
  /**
    * A component to show a single cell inside of a table.
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
    *
    * If you want to support multiline text, please use View instead, as multiline text doesn't comply with
    * MD Guidelines (https://github.com/callstack/react-native-paper/issues/2381).
    */
  object default {
    
    inline def apply(hasChildrenTextStyleStyleNumericRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasChildrenTextStyleStyleNumericRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableCell", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableCell", "default.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = (RemoveChildren[
    ComponentType[PickTouchableWithoutFeedb] & (NonReactStatics[ComponentType[TouchableWithoutFeedbackP] & Call, js.Object])
  ]) & Numeric
}
