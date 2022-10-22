package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.outAnyComputeMod.ComputeRaw
import typingsJapgolly.tsToolbelt.outObjectOverwriteMod.Overwrite
import typingsJapgolly.tsToolbelt.outUnionIntersectOfMod.IntersectOf
import typingsJapgolly.tsToolbelt.outUnionStrictMod.Strict
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUnionMergeMod {
  
  type Merge[U /* <: js.Object */] = ComputeRaw[_Merge[Strict[U]]]
  
  /**
    * @hidden
    */
  type _Merge[U /* <: js.Object */] = IntersectOf[
    Overwrite[
      U, 
      /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof U ]: -? ts-toolbelt.ts-toolbelt/out/Any/At.At<U, K>} */ js.Any
    ]
  ]
}
