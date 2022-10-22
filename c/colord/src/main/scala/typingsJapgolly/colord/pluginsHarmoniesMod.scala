package typingsJapgolly.colord

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.colord.extendMod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsHarmoniesMod extends Shortcut {
  
  /**
    * A plugin adding functionality to generate harmony colors.
    * https://en.wikipedia.org/wiki/Harmony_(color)
    */
  @JSImport("colord/plugins/harmonies", JSImport.Default)
  @js.native
  val default: Plugin = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.colord.colordStrings.analogous
    - typingsJapgolly.colord.colordStrings.complementary
    - typingsJapgolly.colord.colordStrings.`double-split-complementary`
    - typingsJapgolly.colord.colordStrings.rectangle
    - typingsJapgolly.colord.colordStrings.`split-complementary`
    - typingsJapgolly.colord.colordStrings.tetradic
    - typingsJapgolly.colord.colordStrings.triadic
  */
  trait HarmonyType extends StObject
  object HarmonyType {
    
    inline def analogous: typingsJapgolly.colord.colordStrings.analogous = "analogous".asInstanceOf[typingsJapgolly.colord.colordStrings.analogous]
    
    inline def complementary: typingsJapgolly.colord.colordStrings.complementary = "complementary".asInstanceOf[typingsJapgolly.colord.colordStrings.complementary]
    
    inline def `double-split-complementary`: typingsJapgolly.colord.colordStrings.`double-split-complementary` = "double-split-complementary".asInstanceOf[typingsJapgolly.colord.colordStrings.`double-split-complementary`]
    
    inline def rectangle: typingsJapgolly.colord.colordStrings.rectangle = "rectangle".asInstanceOf[typingsJapgolly.colord.colordStrings.rectangle]
    
    inline def `split-complementary`: typingsJapgolly.colord.colordStrings.`split-complementary` = "split-complementary".asInstanceOf[typingsJapgolly.colord.colordStrings.`split-complementary`]
    
    inline def tetradic: typingsJapgolly.colord.colordStrings.tetradic = "tetradic".asInstanceOf[typingsJapgolly.colord.colordStrings.tetradic]
    
    inline def triadic: typingsJapgolly.colord.colordStrings.triadic = "triadic".asInstanceOf[typingsJapgolly.colord.colordStrings.triadic]
  }
  
  type _To = Plugin
  
  /* This means you don't have to write `default`, but can instead just say `pluginsHarmoniesMod.foo` */
  override def _to: Plugin = default
  
  /* augmented module */
  object colordColordAugmentingMod {
    
    @js.native
    trait Colord extends StObject {
      
      /**
        * Returns an array of harmony colors as `Colord` instances.
        */
      def harmonies(): js.Array[Colord] = js.native
      def harmonies(`type`: HarmonyType): js.Array[Colord] = js.native
    }
  }
}
