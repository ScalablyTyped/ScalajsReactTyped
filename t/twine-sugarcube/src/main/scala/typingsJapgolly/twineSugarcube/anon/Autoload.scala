package typingsJapgolly.twineSugarcube.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.twineSugarcube.configMod.SaveObjectHander
import typingsJapgolly.twineSugarcube.extensionsMod.global.Array
import typingsJapgolly.twineSugarcube.saveMod.SaveDetails
import typingsJapgolly.twineSugarcube.saveMod.SaveObject
import typingsJapgolly.twineSugarcube.twineSugarcubeBooleans.`true`
import typingsJapgolly.twineSugarcube.twineSugarcubeStrings.prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autoload extends StObject {
  
  /**
    * Determines whether the autosave, if it exists, is automatically loaded upon story startup. Valid values are
    * boolean true, which simply causes the autosave to be loaded, the string "prompt", which prompts the player via a
    * dialog to load the autosave, or a function, which causes the autosave to be loaded if its return value is truthy.
    *
    * **NOTE**: If the autosave cannot be loaded, for any reason, then the start passage is loaded instead.
    * @since 2.0.0
    * @example
    * // Automatically loads the autosave
    * Config.saves.autoload = true;
    *
    * // Prompts the player about loading the autosave
    * Config.saves.autoload = "prompt";
    *
    * // Loads the autosave if it returns a truthy value
    * Config.saves.autoload = function () {
    *     // code
    * };
    */
  var autoload: Boolean | prompt | js.Function0[Boolean] | Null
  
  /**
    * Determines whether the autosave is created/updated when passages are displayed. Valid values are boolean true,
    * which causes the autosave to be updated with every passage, an array of strings, which causes the autosave to
    * be updated for each passage with at least one matching tag, or a function, which causes the autosave to be
    * updated for each passage where its return value is truthy.
    *
    * **WARNING**: When setting the value to boolean true, you will likely also need to use the Config.saves.isAllowed
    * property to disallow saving on the start passage. Or, if you use the start passage as real part of your story and
    * allow the player to reenter it, rather than just as the initial landing/cover page, then you might wish to only
    * disallow saving on the start passage the very first time it's displayed (at story startup).
    * @since 2.0.0
    * @since 2.30.0: Added function values and deprecated string values.
    * @example
    * // Autosaves every passage
    * Config.saves.autosave = true;
    *
    * // Autosaves on passages tagged with any of "bookmark" or "autosave"
    * Config.saves.autosave = ["bookmark", "autosave"];
    *
    * // Autosaves on passages if it returns a truthy value
    * Config.saves.autosave = function () {
    *     // code
    * };
    */
  var autosave: `true` | String | Array[String] | js.Function0[Boolean] | Null
  
  /**
    * Sets the story ID associated with saves.
    * @default slugified story title
    * @since 2.0.0
    * @example
    *  Config.saves.id = "a-big-huge-story-part-1";
    */
  var id: String
  
  /**
    * Determines whether saving is allowed within the current context. The callback is invoked each time a save is
    * requested. If its return value is false, the save is disallowed. If its return value is truthy, the save is
    * allowed to continue unperturbed.
    * @default undefined
    * @since 2.0.0
    * @example
    * Config.saves.isAllowed = function () {
    *     // code
    * };
    */
  var isAllowed: js.Function0[Boolean] | Null
  
  /**
    * Performs any required pre-processing before the save data is loaded. The callback is passed one parameter, the
    * save object to be processed. If it encounters an unrecoverable problem during its processing, it may throw an
    * exception containing an error message; the message will be displayed to the player and loading of the save will
    * be terminated.
    *
    * @see SaveObject
    * @default undefined
    * @since 2.0.0
    * @deprecated since 2.36.0 in favor of the Save Events API.
    * @example
    * Config.saves.onLoad = function (save) {
    * // code
    * };
    */
  var onLoad: SaveObjectHander | Null
  
  /**
    * Performs any required post-processing before the save data is saved. The callback is passed one parameter, the
    * save object to be processed.
    *
    * NOTE: See the save objects section of the Save API for information on the format of a save.
    * @default undefined
    * @since 2.0.0
    * @since 2.33.0: Added save operation details object parameter to the callback function.
    * @deprecated since 2.36.0 in favor of the Save Events API.
    * @example
    * Config.saves.onSave = function (save) {
    * // code
    * };
    */
  var onSave: SaveObjectHander | Null
  
  /**
    * Sets the maximum number of available save slots.
    *
    * @default 8
    * @since 2.0.0
    * @example
    * Config.saves.slots = 4;
    */
  var slots: Double
  
  /**
    * Determines whether saving to disk is enabled on mobile devices — i.e., smartphones, tablets, etc.
    *
    * WARNING: Mobile browsers can be fickle, so saving to disk may not work as expected in all browsers.
    * @default true
    * @since 2.34.0
    * @example
    * // To disable saving to disk on mobile devices.
    * Config.saves.tryDiskOnMobile = false;
    */
  var tryDiskOnMobile: Boolean
  
  /**
    * Sets the version property of saves.
    *
    * **NOTE**: This setting is only used to set the version property of saves. Thus, it is only truly useful if you plan
    * to upgrade out-of-date saves via a Config.saves.onLoad callback.
    *
    * @since 2.0.0
    * @example
    * // As an integer
    * Config.saves.version = 3;
    * @example
    * // As a string
    * Config.saves.version = "v3";
    */
  var version: Any
}
object Autoload {
  
  inline def apply(id: String, slots: Double, tryDiskOnMobile: Boolean, version: Any): Autoload = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any], tryDiskOnMobile = tryDiskOnMobile.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], autoload = null, autosave = null, isAllowed = null, onLoad = null, onSave = null)
    __obj.asInstanceOf[Autoload]
  }
  
  extension [Self <: Autoload](x: Self) {
    
    inline def setAutoload(value: Boolean | prompt | js.Function0[Boolean]): Self = StObject.set(x, "autoload", value.asInstanceOf[js.Any])
    
    inline def setAutoloadCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "autoload", value.toJsFn)
    
    inline def setAutoloadNull: Self = StObject.set(x, "autoload", null)
    
    inline def setAutosave(value: `true` | String | Array[String] | js.Function0[Boolean]): Self = StObject.set(x, "autosave", value.asInstanceOf[js.Any])
    
    inline def setAutosaveCallbackTo(value: CallbackTo[Boolean]): Self = StObject.set(x, "autosave", value.toJsFn)
    
    inline def setAutosaveNull: Self = StObject.set(x, "autosave", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsAllowed(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAllowed", value.toJsFn)
    
    inline def setIsAllowedNull: Self = StObject.set(x, "isAllowed", null)
    
    inline def setOnLoad(value: (/* save */ SaveObject, /* details */ SaveDetails) => Callback): Self = StObject.set(x, "onLoad", js.Any.fromFunction2((t0: /* save */ SaveObject, t1: /* details */ SaveDetails) => (value(t0, t1)).runNow()))
    
    inline def setOnLoadNull: Self = StObject.set(x, "onLoad", null)
    
    inline def setOnSave(value: (/* save */ SaveObject, /* details */ SaveDetails) => Callback): Self = StObject.set(x, "onSave", js.Any.fromFunction2((t0: /* save */ SaveObject, t1: /* details */ SaveDetails) => (value(t0, t1)).runNow()))
    
    inline def setOnSaveNull: Self = StObject.set(x, "onSave", null)
    
    inline def setSlots(value: Double): Self = StObject.set(x, "slots", value.asInstanceOf[js.Any])
    
    inline def setTryDiskOnMobile(value: Boolean): Self = StObject.set(x, "tryDiskOnMobile", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: Any): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
