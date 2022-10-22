package typingsJapgolly.tsToolbelt

import typingsJapgolly.tsToolbelt.tsToolbeltStrings.Exclamationmark
import typingsJapgolly.tsToolbelt.tsToolbeltStrings.Questionmark
import typingsJapgolly.tsToolbelt.tsToolbeltStrings.R
import typingsJapgolly.tsToolbelt.tsToolbeltStrings.W
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outObjectInternalMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof O ]: any}
    }}}
    */
  @js.native
  trait Anyfy[O /* <: js.Object */] extends StObject
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tsToolbelt.tsToolbeltStrings.flat
    - typingsJapgolly.tsToolbelt.tsToolbeltStrings.deep
  */
  trait Depth extends StObject
  object Depth {
    
    inline def deep: typingsJapgolly.tsToolbelt.tsToolbeltStrings.deep = "deep".asInstanceOf[typingsJapgolly.tsToolbelt.tsToolbeltStrings.deep]
    
    inline def flat: typingsJapgolly.tsToolbelt.tsToolbeltStrings.flat = "flat".asInstanceOf[typingsJapgolly.tsToolbelt.tsToolbeltStrings.flat]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`
    - typingsJapgolly.tsToolbelt.tsToolbeltInts.`1`
    - typingsJapgolly.tsToolbelt.tsToolbeltInts.`2`
  */
  trait MergeStyle extends StObject
  object MergeStyle {
    
    inline def `0`: typingsJapgolly.tsToolbelt.tsToolbeltInts.`0` = 0.asInstanceOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`0`]
    
    inline def `1`: typingsJapgolly.tsToolbelt.tsToolbeltInts.`1` = 1.asInstanceOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`1`]
    
    inline def `2`: typingsJapgolly.tsToolbelt.tsToolbeltInts.`2` = 2.asInstanceOf[typingsJapgolly.tsToolbelt.tsToolbeltInts.`2`]
  }
  
  type Modx = js.Tuple2[Questionmark | Exclamationmark, W | R]
}
