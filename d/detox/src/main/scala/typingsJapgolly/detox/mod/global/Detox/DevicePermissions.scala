package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *  Source for string definitions is https://github.com/wix/AppleSimulatorUtils
  */
trait DevicePermissions extends StObject {
  
  var calendar: js.UndefOr[CalendarPermission] = js.undefined
  
  var camera: js.UndefOr[CameraPermission] = js.undefined
  
  var contacts: js.UndefOr[ContactsPermission] = js.undefined
  
  var faceid: js.UndefOr[FaceIDPermission] = js.undefined
  
  var health: js.UndefOr[HealthPermission] = js.undefined
  
  var homekit: js.UndefOr[HomekitPermission] = js.undefined
  
  var location: js.UndefOr[LocationPermission] = js.undefined
  
  var medialibrary: js.UndefOr[MediaLibraryPermission] = js.undefined
  
  var microphone: js.UndefOr[MicrophonePermission] = js.undefined
  
  var motion: js.UndefOr[MotionPermission] = js.undefined
  
  var notifications: js.UndefOr[NotificationsPermission] = js.undefined
  
  var photos: js.UndefOr[PhotosPermission] = js.undefined
  
  var reminders: js.UndefOr[RemindersPermission] = js.undefined
  
  var siri: js.UndefOr[SiriPermission] = js.undefined
  
  var speech: js.UndefOr[SpeechPermission] = js.undefined
  
  var userTracking: js.UndefOr[UserTrackingPermission] = js.undefined
}
object DevicePermissions {
  
  inline def apply(): DevicePermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DevicePermissions]
  }
  
  extension [Self <: DevicePermissions](x: Self) {
    
    inline def setCalendar(value: CalendarPermission): Self = StObject.set(x, "calendar", value.asInstanceOf[js.Any])
    
    inline def setCalendarUndefined: Self = StObject.set(x, "calendar", js.undefined)
    
    inline def setCamera(value: CameraPermission): Self = StObject.set(x, "camera", value.asInstanceOf[js.Any])
    
    inline def setCameraUndefined: Self = StObject.set(x, "camera", js.undefined)
    
    inline def setContacts(value: ContactsPermission): Self = StObject.set(x, "contacts", value.asInstanceOf[js.Any])
    
    inline def setContactsUndefined: Self = StObject.set(x, "contacts", js.undefined)
    
    inline def setFaceid(value: FaceIDPermission): Self = StObject.set(x, "faceid", value.asInstanceOf[js.Any])
    
    inline def setFaceidUndefined: Self = StObject.set(x, "faceid", js.undefined)
    
    inline def setHealth(value: HealthPermission): Self = StObject.set(x, "health", value.asInstanceOf[js.Any])
    
    inline def setHealthUndefined: Self = StObject.set(x, "health", js.undefined)
    
    inline def setHomekit(value: HomekitPermission): Self = StObject.set(x, "homekit", value.asInstanceOf[js.Any])
    
    inline def setHomekitUndefined: Self = StObject.set(x, "homekit", js.undefined)
    
    inline def setLocation(value: LocationPermission): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMedialibrary(value: MediaLibraryPermission): Self = StObject.set(x, "medialibrary", value.asInstanceOf[js.Any])
    
    inline def setMedialibraryUndefined: Self = StObject.set(x, "medialibrary", js.undefined)
    
    inline def setMicrophone(value: MicrophonePermission): Self = StObject.set(x, "microphone", value.asInstanceOf[js.Any])
    
    inline def setMicrophoneUndefined: Self = StObject.set(x, "microphone", js.undefined)
    
    inline def setMotion(value: MotionPermission): Self = StObject.set(x, "motion", value.asInstanceOf[js.Any])
    
    inline def setMotionUndefined: Self = StObject.set(x, "motion", js.undefined)
    
    inline def setNotifications(value: NotificationsPermission): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
    
    inline def setNotificationsUndefined: Self = StObject.set(x, "notifications", js.undefined)
    
    inline def setPhotos(value: PhotosPermission): Self = StObject.set(x, "photos", value.asInstanceOf[js.Any])
    
    inline def setPhotosUndefined: Self = StObject.set(x, "photos", js.undefined)
    
    inline def setReminders(value: RemindersPermission): Self = StObject.set(x, "reminders", value.asInstanceOf[js.Any])
    
    inline def setRemindersUndefined: Self = StObject.set(x, "reminders", js.undefined)
    
    inline def setSiri(value: SiriPermission): Self = StObject.set(x, "siri", value.asInstanceOf[js.Any])
    
    inline def setSiriUndefined: Self = StObject.set(x, "siri", js.undefined)
    
    inline def setSpeech(value: SpeechPermission): Self = StObject.set(x, "speech", value.asInstanceOf[js.Any])
    
    inline def setSpeechUndefined: Self = StObject.set(x, "speech", js.undefined)
    
    inline def setUserTracking(value: UserTrackingPermission): Self = StObject.set(x, "userTracking", value.asInstanceOf[js.Any])
    
    inline def setUserTrackingUndefined: Self = StObject.set(x, "userTracking", js.undefined)
  }
}
