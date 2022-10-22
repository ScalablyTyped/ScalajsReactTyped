package typingsJapgolly.scrambo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scrambo", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Scrambo
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.scrambo.scramboStrings.`222`
    - typingsJapgolly.scrambo.scramboStrings.`333`
    - typingsJapgolly.scrambo.scramboStrings.`444`
    - typingsJapgolly.scrambo.scramboStrings.`555`
    - typingsJapgolly.scrambo.scramboStrings.`666`
    - typingsJapgolly.scrambo.scramboStrings.`777`
  */
  trait NNN extends StObject
  object NNN {
    
    inline def `222`: typingsJapgolly.scrambo.scramboStrings.`222` = "222".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`222`]
    
    inline def `333`: typingsJapgolly.scrambo.scramboStrings.`333` = "333".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`333`]
    
    inline def `444`: typingsJapgolly.scrambo.scramboStrings.`444` = "444".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`444`]
    
    inline def `555`: typingsJapgolly.scrambo.scramboStrings.`555` = "555".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`555`]
    
    inline def `666`: typingsJapgolly.scrambo.scramboStrings.`666` = "666".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`666`]
    
    inline def `777`: typingsJapgolly.scrambo.scramboStrings.`777` = "777".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`777`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.scrambo.scramboStrings.clock
    - typingsJapgolly.scrambo.scramboStrings.minx
    - typingsJapgolly.scrambo.scramboStrings.pyram
    - typingsJapgolly.scrambo.scramboStrings.sq1
    - typingsJapgolly.scrambo.scramboStrings.skewb
    - typingsJapgolly.scrambo.scramboStrings.`222`
    - typingsJapgolly.scrambo.scramboStrings.`333`
    - typingsJapgolly.scrambo.scramboStrings.`444`
    - typingsJapgolly.scrambo.scramboStrings.`555`
    - typingsJapgolly.scrambo.scramboStrings.`666`
    - typingsJapgolly.scrambo.scramboStrings.`777`
  */
  trait ScrambleType extends StObject
  object ScrambleType {
    
    inline def `222`: typingsJapgolly.scrambo.scramboStrings.`222` = "222".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`222`]
    
    inline def `333`: typingsJapgolly.scrambo.scramboStrings.`333` = "333".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`333`]
    
    inline def `444`: typingsJapgolly.scrambo.scramboStrings.`444` = "444".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`444`]
    
    inline def `555`: typingsJapgolly.scrambo.scramboStrings.`555` = "555".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`555`]
    
    inline def `666`: typingsJapgolly.scrambo.scramboStrings.`666` = "666".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`666`]
    
    inline def `777`: typingsJapgolly.scrambo.scramboStrings.`777` = "777".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.`777`]
    
    inline def clock: typingsJapgolly.scrambo.scramboStrings.clock = "clock".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.clock]
    
    inline def minx: typingsJapgolly.scrambo.scramboStrings.minx = "minx".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.minx]
    
    inline def pyram: typingsJapgolly.scrambo.scramboStrings.pyram = "pyram".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.pyram]
    
    inline def skewb: typingsJapgolly.scrambo.scramboStrings.skewb = "skewb".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.skewb]
    
    inline def sq1: typingsJapgolly.scrambo.scramboStrings.sq1 = "sq1".asInstanceOf[typingsJapgolly.scrambo.scramboStrings.sq1]
  }
  
  @js.native
  trait Scrambo extends StObject {
    
    /**
      * Returns an array of random scrambles with the given length
      * for the configured scrambler type.
      * @param number defaults to 1
      */
    def get(): js.Array[String] = js.native
    def get(number: Double): js.Array[String] = js.native
    
    /**
      * Returns the currently configured scramble length.
      */
    def length(): Double = js.native
    /**
      * Sets this instance's scramble length and returns the original instance.
      * @param length
      */
    def length(length: Double): Scrambo = js.native
    
    /**
      * Returns the current seed type of this scrambler.
      */
    def seed(): Double = js.native
    /**
      * Sets this instance's seed and returns the original instance.
      * @param seed
      */
    def seed(seed: Double): Scrambo = js.native
    
    /**
      * Returns the currently configured scrambler type.
      */
    def `type`(): ScrambleType = js.native
    /**
      * Sets this instance's scrambler type and returns the original instance.
      * @param type
      */
    def `type`(`type`: ScrambleType): Scrambo = js.native
  }
}
