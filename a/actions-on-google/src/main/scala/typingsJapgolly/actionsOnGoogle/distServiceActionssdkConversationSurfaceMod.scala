package typingsJapgolly.actionsOnGoogle

import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Capability
import typingsJapgolly.actionsOnGoogle.distServiceActionssdkApiV2Mod.GoogleActionsV2Surface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServiceActionssdkConversationSurfaceMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", "Available")
  @js.native
  /** @hidden */
  open class Available () extends StObject {
    def this(surfaces: js.Array[GoogleActionsV2Surface]) = this()
    
    /** @public */
    var surfaces: AvailableSurfaces = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", "AvailableSurfaces")
  @js.native
  open class AvailableSurfaces protected () extends StObject {
    /** @hidden */
    def this(list: js.Array[GoogleActionsV2Surface]) = this()
    
    /** @public */
    var capabilities: AvailableSurfacesCapabilities = js.native
    
    /**
      * Checks if available surfaces has an attribute like a capability
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   if (conv.available.surfaces.has('actions.capability.SCREEN_OUTPUT')) {
      *     conv.ask('You have a device that can view images! How are you?')
      *   } else {
      *     conv.ask('You do not have a device that can view images! How are you?')
      *   }
      * })
      * ```
      *
      * @param attribute An attribute like SurfaceCapability
      * @public
      */
    def has(attribute: SurfaceCapability): Boolean = js.native
    
    /** @public */
    var list: js.Array[Surface] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", "AvailableSurfacesCapabilities")
  @js.native
  open class AvailableSurfacesCapabilities protected () extends StObject {
    /** @hidden */
    def this(surfaces: js.Array[Surface]) = this()
    
    /**
      * Returns true if user has an available surface which includes all given
      * capabilities. Available surfaces capabilities may exist on surfaces other
      * than that used for an ongoing conversation.
      * @public
      */
    def has(capability: SurfaceCapability): Boolean = js.native
    
    /** @public */
    var surfaces: js.Array[Surface] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", "Capabilities")
  @js.native
  /** @hidden */
  open class Capabilities () extends StObject {
    def this(list: js.Array[GoogleActionsV2Capability]) = this()
    
    /**
      * Returns true if user device has a given surface capability.
      * @public
      */
    def has(capability: SurfaceCapability): Boolean = js.native
    
    /**
      * List of surface capabilities of user device.
      * @public
      */
    var list: js.Array[GoogleActionsV2Capability] = js.native
  }
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/surface", "Surface")
  @js.native
  /** @hidden */
  open class Surface () extends StObject {
    def this(surface: GoogleActionsV2Surface) = this()
    
    /** @public */
    var capabilities: Capabilities = js.native
    
    /**
      * Checks if surface has an attribute like a capability
      *
      * @example
      * ```javascript
      *
      * app.intent('Default Welcome Intent', conv => {
      *   if (conv.surface.has('actions.capability.AUDIO_OUTPUT')) {
      *     conv.ask('You can hear me! How are you?')
      *   } else {
      *     conv.ask('You can read this! How are you?')
      *   }
      * })
      * ```
      *
      * @param attribute An attribute like SurfaceCapability
      * @public
      */
    def has(attribute: SurfaceCapability): Boolean = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotAUDIO_OUTPUT
    - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotSCREEN_OUTPUT
    - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotMEDIA_RESPONSE_AUDIO
    - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotWEB_BROWSER
    - typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotINTERACTIVE_CANVAS
  */
  trait SurfaceCapability extends StObject
  object SurfaceCapability {
    
    inline def actionsDotcapabilityDotAUDIO_OUTPUT: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotAUDIO_OUTPUT = "actions.capability.AUDIO_OUTPUT".asInstanceOf[typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotAUDIO_OUTPUT]
    
    inline def actionsDotcapabilityDotINTERACTIVE_CANVAS: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotINTERACTIVE_CANVAS = "actions.capability.INTERACTIVE_CANVAS".asInstanceOf[typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotINTERACTIVE_CANVAS]
    
    inline def actionsDotcapabilityDotMEDIA_RESPONSE_AUDIO: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotMEDIA_RESPONSE_AUDIO = "actions.capability.MEDIA_RESPONSE_AUDIO".asInstanceOf[typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotMEDIA_RESPONSE_AUDIO]
    
    inline def actionsDotcapabilityDotSCREEN_OUTPUT: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotSCREEN_OUTPUT = "actions.capability.SCREEN_OUTPUT".asInstanceOf[typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotSCREEN_OUTPUT]
    
    inline def actionsDotcapabilityDotWEB_BROWSER: typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotWEB_BROWSER = "actions.capability.WEB_BROWSER".asInstanceOf[typingsJapgolly.actionsOnGoogle.actionsOnGoogleStrings.actionsDotcapabilityDotWEB_BROWSER]
  }
}
