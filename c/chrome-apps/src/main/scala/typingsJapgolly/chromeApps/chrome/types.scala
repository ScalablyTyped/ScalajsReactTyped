package typingsJapgolly.chromeApps.chrome

import typingsJapgolly.chromeApps.chrome.events.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region chrome.types
///////////
// Types //
///////////
/**
  * The chrome.types API contains type declarations for Chrome.
  */
object types {
  
  /** An interface that allows access to a Chrome browser setting. See accessibilityFeatures for an example. */
  @js.native
  trait ChromeSetting extends StObject {
    
    /**
      * Clears the setting, restoring any default value.
      * @param details Which setting to clear.
      * @param callback Called at the completion of the clear operation.
      */
    def clear(details: ChromeSettingClearDetails): Unit = js.native
    def clear(details: ChromeSettingClearDetails, callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Gets the value of a setting.
      * @param details Which setting to consider.
      */
    def get(details: ChromeSettingGetDetails): Unit = js.native
    def get(details: ChromeSettingGetDetails, callback: DetailsCallback): Unit = js.native
    
    /** Fired after the setting changes. */
    var onChange: ChromeSettingChangedEvent = js.native
    
    /**
      * Sets the value of a setting.
      * @param details Which setting to change.
      * @param callback Called at the completion of the set operation.
      */
    def set(details: ChromeSettingSetDetails): Unit = js.native
    def set(details: ChromeSettingSetDetails, callback: js.Function0[Unit]): Unit = js.native
  }
  
  type ChromeSettingChangedEvent = Event[DetailsCallback]
  
  trait ChromeSettingClearDetails extends StObject {
    
    /**
      * The scope of the ChromeSetting. One of
      * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
      * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
      * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
      * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted
      *     when the incognito session ends (overrides regular and incognito_persistent preferences).
      */
    var scope: js.UndefOr[ChromeSettingScope] = js.undefined
  }
  object ChromeSettingClearDetails {
    
    inline def apply(): ChromeSettingClearDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeSettingClearDetails]
    }
    
    extension [Self <: ChromeSettingClearDetails](x: Self) {
      
      inline def setScope(value: ChromeSettingScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait ChromeSettingGetDetails extends StObject {
    
    /** Whether to return the value that applies to the incognito session (default false). */
    var incognito: js.UndefOr[Boolean] = js.undefined
  }
  object ChromeSettingGetDetails {
    
    inline def apply(): ChromeSettingGetDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChromeSettingGetDetails]
    }
    
    extension [Self <: ChromeSettingGetDetails](x: Self) {
      
      inline def setIncognito(value: Boolean): Self = StObject.set(x, "incognito", value.asInstanceOf[js.Any])
      
      inline def setIncognitoUndefined: Self = StObject.set(x, "incognito", js.undefined)
    }
  }
  
  trait ChromeSettingGetResultDetails extends StObject {
    
    /**
      * Whether the effective value is specific to the incognito session.
      * This property will only be present if the incognito property in the details parameter of get() was true.
      */
    var incognitoSpecific: js.UndefOr[Boolean] = js.undefined
    
    /**
      * One of
      * • not_controllable: cannot be controlled by any extension
      * • controlled_by_other_extensions: controlled by extensions with higher precedence
      * • controllable_by_this_extension: can be controlled by this app
      * • controlled_by_this_extension: controlled by this app
      */
    var levelOfControl: String
    
    /** The value of the setting. */
    var value: Any
  }
  object ChromeSettingGetResultDetails {
    
    inline def apply(levelOfControl: String, value: Any): ChromeSettingGetResultDetails = {
      val __obj = js.Dynamic.literal(levelOfControl = levelOfControl.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromeSettingGetResultDetails]
    }
    
    extension [Self <: ChromeSettingGetResultDetails](x: Self) {
      
      inline def setIncognitoSpecific(value: Boolean): Self = StObject.set(x, "incognitoSpecific", value.asInstanceOf[js.Any])
      
      inline def setIncognitoSpecificUndefined: Self = StObject.set(x, "incognitoSpecific", js.undefined)
      
      inline def setLevelOfControl(value: String): Self = StObject.set(x, "levelOfControl", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The scope of the ChromeSetting. One of
    * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
    * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
    * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
    * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted
    *     when the incognito session ends (overrides regular and incognito_persistent preferences).
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.regular
    - typingsJapgolly.chromeApps.chromeAppsStrings.regular_only
    - typingsJapgolly.chromeApps.chromeAppsStrings.incognito_persistent
    - typingsJapgolly.chromeApps.chromeAppsStrings.incognito_session_only
  */
  trait ChromeSettingScope extends StObject
  object ChromeSettingScope {
    
    inline def incognito_persistent: typingsJapgolly.chromeApps.chromeAppsStrings.incognito_persistent = "incognito_persistent".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.incognito_persistent]
    
    inline def incognito_session_only: typingsJapgolly.chromeApps.chromeAppsStrings.incognito_session_only = "incognito_session_only".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.incognito_session_only]
    
    inline def regular: typingsJapgolly.chromeApps.chromeAppsStrings.regular = "regular".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.regular]
    
    inline def regular_only: typingsJapgolly.chromeApps.chromeAppsStrings.regular_only = "regular_only".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.regular_only]
  }
  
  trait ChromeSettingSetDetails
    extends StObject
       with ChromeSettingClearDetails {
    
    /**
      * The value of the setting.
      * Note that every setting has a specific value type,
      * which is described together with the setting.
      * An app should not set a value of a different type.
      */
    var value: Any
  }
  object ChromeSettingSetDetails {
    
    inline def apply(value: Any): ChromeSettingSetDetails = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChromeSettingSetDetails]
    }
    
    extension [Self <: ChromeSettingSetDetails](x: Self) {
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @param details Details of the currently effective value.
    */
  type DetailsCallback = js.Function1[/* details */ ChromeSettingGetResultDetails, Unit]
  
  /**
    * One of
    * • not_controllable: cannot be controlled by any extension
    * • controlled_by_other_extensions: controlled by extensions with higher precedence
    * • controllable_by_this_extension: can be controlled by this app
    * • controlled_by_this_extension: controlled by this app
    */
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.chromeApps.chromeAppsStrings.not_controllable
    - typingsJapgolly.chromeApps.chromeAppsStrings.controlled_by_other_extensions
    - typingsJapgolly.chromeApps.chromeAppsStrings.controllable_by_this_extension
    - typingsJapgolly.chromeApps.chromeAppsStrings.controlled_by_this_extension
  */
  trait LevelOfControl extends StObject
  object LevelOfControl {
    
    inline def controllable_by_this_extension: typingsJapgolly.chromeApps.chromeAppsStrings.controllable_by_this_extension = "controllable_by_this_extension".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.controllable_by_this_extension]
    
    inline def controlled_by_other_extensions: typingsJapgolly.chromeApps.chromeAppsStrings.controlled_by_other_extensions = "controlled_by_other_extensions".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.controlled_by_other_extensions]
    
    inline def controlled_by_this_extension: typingsJapgolly.chromeApps.chromeAppsStrings.controlled_by_this_extension = "controlled_by_this_extension".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.controlled_by_this_extension]
    
    inline def not_controllable: typingsJapgolly.chromeApps.chromeAppsStrings.not_controllable = "not_controllable".asInstanceOf[typingsJapgolly.chromeApps.chromeAppsStrings.not_controllable]
  }
}
