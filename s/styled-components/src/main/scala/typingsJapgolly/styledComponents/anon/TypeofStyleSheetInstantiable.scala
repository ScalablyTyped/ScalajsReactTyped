package typingsJapgolly.styledComponents.anon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typingsJapgolly.styledComponents.nativeDistDistSheetMod.default
import typingsJapgolly.styledComponents.nativeDistDistSheetSheetMod.GlobalStylesAllocationMap
import typingsJapgolly.styledComponents.nativeDistDistSheetSheetMod.NamesAllocationMap
import typingsJapgolly.styledComponents.nativeDistDistSheetSheetMod.SheetConstructorArgs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofStyleSheetInstantiable
  extends StObject
     with Instantiable0[default]
     with Instantiable1[/* options */ SheetConstructorArgs, default]
     with Instantiable2[
      (/* options */ SheetConstructorArgs) | (/* options */ Unit), 
      /* globalStyles */ GlobalStylesAllocationMap, 
      default
    ]
     with Instantiable3[
      (/* options */ SheetConstructorArgs) | (/* options */ Unit), 
      (/* globalStyles */ GlobalStylesAllocationMap) | (/* globalStyles */ Unit), 
      /* names */ NamesAllocationMap, 
      default
    ] {
  
  /** Register a group ID to give it an index */
  def registerId(id: String): Double = js.native
}
