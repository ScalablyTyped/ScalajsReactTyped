package typingsJapgolly.typeFest

import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Pick
import typingsJapgolly.typeFest.anon.Dictindex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceFixedLengthArrayMod {
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.typeFest.typeFestStrings.splice
    - typingsJapgolly.typeFest.typeFestStrings.push
    - typingsJapgolly.typeFest.typeFestStrings.pop
    - typingsJapgolly.typeFest.typeFestStrings.shift
    - typingsJapgolly.typeFest.typeFestStrings.unshift
  */
  trait ArrayLengthMutationKeys extends StObject
  object ArrayLengthMutationKeys {
    
    inline def pop: typingsJapgolly.typeFest.typeFestStrings.pop = "pop".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.pop]
    
    inline def push: typingsJapgolly.typeFest.typeFestStrings.push = "push".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.push]
    
    inline def shift: typingsJapgolly.typeFest.typeFestStrings.shift = "shift".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.shift]
    
    inline def splice: typingsJapgolly.typeFest.typeFestStrings.splice = "splice".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.splice]
    
    inline def unshift: typingsJapgolly.typeFest.typeFestStrings.unshift = "unshift".asInstanceOf[typingsJapgolly.typeFest.typeFestStrings.unshift]
  }
  
  type FixedLengthArray[Element, Length /* <: Double */, ArrayPrototype] = (Pick[
    ArrayPrototype, 
    Exclude[/* keyof ArrayPrototype */ String, ArrayLengthMutationKeys]
  ]) & (Dictindex[Element, Length])
}
