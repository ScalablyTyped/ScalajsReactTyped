package typingsJapgolly.reactNativePaper

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentPropsWithRef
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.TouchableWithoutFeedback
import typingsJapgolly.reactNativePaper.anon.CallHasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRest
import typingsJapgolly.reactNativePaper.anon.NumberOfLines
import typingsJapgolly.reactNativePaper.anon.PickTouchableWithoutFeedbAccessibilityHint
import typingsJapgolly.reactNativePaper.anon.TouchableWithoutFeedbackPAccessibilityActions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptComponentsDataTableDataTableTitleMod extends Shortcut {
  
  @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableTitle", JSImport.Default)
  @js.native
  val default: ComponentType[PickTouchableWithoutFeedbAccessibilityHint] & (NonReactStatics[
    ComponentType[TouchableWithoutFeedbackPAccessibilityActions] & CallHasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRest, 
    js.Object
  ]) = js.native
  
  /**
    * A component to display title in table header.
    *
    * <div class="screenshots">
    *   <figure>
    *     <img class="medium" src="screenshots/data-table-header.png" />
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
    *       <DataTable>
    *         <DataTable.Header>
    *           <DataTable.Title
    *             sortDirection='descending'
    *           >
    *             Dessert
    *           </DataTable.Title>
    *           <DataTable.Title numeric>Calories</DataTable.Title>
    *           <DataTable.Title numeric>Fat (g)</DataTable.Title>
    *         </DataTable.Header>
    *       </DataTable>
    * );
    *
    * export default MyComponent;
    * ```
    */
  object DataTableTitle {
    
    inline def apply(hasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRest: Props): Element = ^.asInstanceOf[js.Dynamic].apply(hasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRest.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableTitle", "DataTableTitle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-paper/lib/typescript/components/DataTable/DataTableTitle", "DataTableTitle.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  type Props = ComponentPropsWithRef[Instantiable0[TouchableWithoutFeedback]] & NumberOfLines
  
  type _To = ComponentType[PickTouchableWithoutFeedbAccessibilityHint] & (NonReactStatics[
    ComponentType[TouchableWithoutFeedbackPAccessibilityActions] & CallHasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRest, 
    js.Object
  ])
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptComponentsDataTableDataTableTitleMod.foo` */
  override def _to: ComponentType[PickTouchableWithoutFeedbAccessibilityHint] & (NonReactStatics[
    ComponentType[TouchableWithoutFeedbackPAccessibilityActions] & CallHasNumericChildrenOnPressSortDirectionThemeTextStyleStyleNumberOfLinesRest, 
    js.Object
  ]) = default
}
