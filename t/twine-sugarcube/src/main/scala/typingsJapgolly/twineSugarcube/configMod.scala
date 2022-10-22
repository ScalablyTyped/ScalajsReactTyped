package typingsJapgolly.twineSugarcube

import typingsJapgolly.twineSugarcube.anon.Autoload
import typingsJapgolly.twineSugarcube.anon.Controls
import typingsJapgolly.twineSugarcube.anon.Descriptions
import typingsJapgolly.twineSugarcube.anon.IfAssignmentError
import typingsJapgolly.twineSugarcube.anon.Override
import typingsJapgolly.twineSugarcube.anon.PauseOnFadeToZero
import typingsJapgolly.twineSugarcube.anon.StowBarInitially
import typingsJapgolly.twineSugarcube.passageMod.Passage
import typingsJapgolly.twineSugarcube.saveMod.SaveDetails
import typingsJapgolly.twineSugarcube.saveMod.SaveObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  trait ConfigAPI extends StObject {
    
    /**
      * Determines whether the link-visited class is added to internal passage links which go to previously visited
      * passages — i.e. the passage already exists within the story history
      *
      * **NOTE** You must provide your own styling for the `link-visited` class as none is provided by default.
      * @default false
      * @since 2.0.0
      * @example
      * Config.addVisitedLinkClass = true;
      * // An example style:
      * .link-visited {
      *      color: purple;
      * }
      */
    var addVisitedLinkClass: Boolean
    
    val audio: PauseOnFadeToZero
    
    /**
      * Determines whether the output of the Wikifier is post-processed into more sane markup — i.e. where appropriate, it
      * tries to transition the plethora of <br> elements into <p> elements.
      * @default false
      * @since 2.0.0
      * @example
      * Config.cleanupWikifierOutput = true;
      */
    var cleanupWikifierOutput: Boolean
    
    /**
      * Indicates whether SugarCube is running in test mode, which enables debug views. See Test Mode for more information.
      *
      * NOTE: This property is automatically set based on whether you're using a testing mode in a Twine compiler — i.e. Test
      * mode in Twine 2, Test Play From Here in Twine 1, or the test mode options (-t, --test) in Tweego. You may, however,
      * forcibly enable it if you need to for some reason — e.g. if you're using another compiler, which doesn't offer a way
      * to enable test mode.
      *
      * @default false
      * @since 2.2.0
      * @example
      * // Forcibly enable test mode
      *  Config.debug = true;
      *
      * @example
      * // Check if test mode is enabled in JavaScript
      * if (Config.debug) {
      *    // do something debug related
      * }
      *
      * @example
      * // Check if test mode is enabled via the <<if>> macro
      * <<if Config.debug>>
      *     // do something debug related
      * <</if>>
      */
    var debug: Boolean
    
    val history: Controls
    
    /**
      * Sets the integer delay (in milliseconds) before the loading screen is dismissed, once the document has signaled its
      * readiness. Not generally necessary, however, some browsers render slower than others and may need a little extra time
      * to get a media-heavy page done. This allows you to fine tune for those cases.
      *
      * @default 0
      * @since 2.0.0
      *
      * @example
      * // Delay the dismissal of the loading screen by 2000ms (2s)
      * Config.loadDelay = 2000;
      */
    var loadDelay: Double
    
    val macros: IfAssignmentError
    
    val navigation: Override
    
    val passages: Descriptions
    
    val saves: Autoload
    
    val ui: StowBarInitially
  }
  object ConfigAPI {
    
    inline def apply(
      addVisitedLinkClass: Boolean,
      audio: PauseOnFadeToZero,
      cleanupWikifierOutput: Boolean,
      debug: Boolean,
      history: Controls,
      loadDelay: Double,
      macros: IfAssignmentError,
      navigation: Override,
      passages: Descriptions,
      saves: Autoload,
      ui: StowBarInitially
    ): ConfigAPI = {
      val __obj = js.Dynamic.literal(addVisitedLinkClass = addVisitedLinkClass.asInstanceOf[js.Any], audio = audio.asInstanceOf[js.Any], cleanupWikifierOutput = cleanupWikifierOutput.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any], loadDelay = loadDelay.asInstanceOf[js.Any], macros = macros.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], passages = passages.asInstanceOf[js.Any], saves = saves.asInstanceOf[js.Any], ui = ui.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigAPI]
    }
    
    extension [Self <: ConfigAPI](x: Self) {
      
      inline def setAddVisitedLinkClass(value: Boolean): Self = StObject.set(x, "addVisitedLinkClass", value.asInstanceOf[js.Any])
      
      inline def setAudio(value: PauseOnFadeToZero): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setCleanupWikifierOutput(value: Boolean): Self = StObject.set(x, "cleanupWikifierOutput", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setHistory(value: Controls): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
      
      inline def setLoadDelay(value: Double): Self = StObject.set(x, "loadDelay", value.asInstanceOf[js.Any])
      
      inline def setMacros(value: IfAssignmentError): Self = StObject.set(x, "macros", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: Override): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setPassages(value: Descriptions): Self = StObject.set(x, "passages", value.asInstanceOf[js.Any])
      
      inline def setSaves(value: Autoload): Self = StObject.set(x, "saves", value.asInstanceOf[js.Any])
      
      inline def setUi(value: StowBarInitially): Self = StObject.set(x, "ui", value.asInstanceOf[js.Any])
    }
  }
  
  type DescriptionHandler = js.ThisFunction0[/* this */ Passage, String | Null]
  
  type SaveObjectHander = js.Function2[/* save */ SaveObject, /* details */ SaveDetails, Unit]
}
