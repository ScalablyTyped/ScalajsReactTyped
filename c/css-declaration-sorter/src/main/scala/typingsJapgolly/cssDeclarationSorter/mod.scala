package typingsJapgolly.cssDeclarationSorter

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.cssDeclarationSorter.anon.KeepOverrides
import typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterInts.`-1`
import typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterInts.`0`
import typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterInts.`1`
import typingsJapgolly.postcss.mod.PluginCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("css-declaration-sorter", JSImport.Namespace)
  @js.native
  val ^ : PluginCreator[KeepOverrides] = js.native
  
  /**
    * This function receives two declaration property names and is expected
    * to return -1, 0 or 1 depending on the wanted order.
    */
  type SortFunction = js.Function2[/* propertyNameA */ String, /* propertyNameB */ String, `-1` | `0` | `1`]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterStrings.alphabetical
    - typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterStrings.`concentric-css`
    - typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterStrings.smacss
  */
  trait SortOrder extends StObject
  object SortOrder {
    
    inline def alphabetical: typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterStrings.alphabetical = "alphabetical".asInstanceOf[typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterStrings.alphabetical]
    
    inline def `concentric-css`: typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterStrings.`concentric-css` = "concentric-css".asInstanceOf[typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterStrings.`concentric-css`]
    
    inline def smacss: typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterStrings.smacss = "smacss".asInstanceOf[typingsJapgolly.cssDeclarationSorter.cssDeclarationSorterStrings.smacss]
  }
  
  type _To = PluginCreator[KeepOverrides]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PluginCreator[KeepOverrides] = ^
}
