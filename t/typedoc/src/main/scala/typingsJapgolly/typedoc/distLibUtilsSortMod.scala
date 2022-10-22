package typingsJapgolly.typedoc

import typingsJapgolly.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typingsJapgolly.typedoc.typedocStrings.`enum-value-ascending`
import typingsJapgolly.typedoc.typedocStrings.`enum-value-descending`
import typingsJapgolly.typedoc.typedocStrings.`instance-first`
import typingsJapgolly.typedoc.typedocStrings.`required-first`
import typingsJapgolly.typedoc.typedocStrings.`source-order`
import typingsJapgolly.typedoc.typedocStrings.`static-first`
import typingsJapgolly.typedoc.typedocStrings.alphabetical
import typingsJapgolly.typedoc.typedocStrings.kind
import typingsJapgolly.typedoc.typedocStrings.visibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsSortMod {
  
  @JSImport("typedoc/dist/lib/utils/sort", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/utils/sort", "SORT_STRATEGIES")
  @js.native
  val SORT_STRATEGIES: js.Tuple9[
    `source-order`, 
    alphabetical, 
    `enum-value-ascending`, 
    `enum-value-descending`, 
    `static-first`, 
    `instance-first`, 
    visibility, 
    `required-first`, 
    kind
  ] = js.native
  
  inline def sortReflections(reflections: js.Array[DeclarationReflection], strategies: js.Array[SortStrategy]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("sortReflections")(reflections.asInstanceOf[js.Any], strategies.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typedoc.typedocStrings.`source-order`
    - typingsJapgolly.typedoc.typedocStrings.alphabetical
    - typingsJapgolly.typedoc.typedocStrings.`enum-value-ascending`
    - typingsJapgolly.typedoc.typedocStrings.`enum-value-descending`
    - typingsJapgolly.typedoc.typedocStrings.`static-first`
    - typingsJapgolly.typedoc.typedocStrings.`instance-first`
    - typingsJapgolly.typedoc.typedocStrings.visibility
    - typingsJapgolly.typedoc.typedocStrings.`required-first`
    - typingsJapgolly.typedoc.typedocStrings.kind
  */
  trait SortStrategy extends StObject
}
