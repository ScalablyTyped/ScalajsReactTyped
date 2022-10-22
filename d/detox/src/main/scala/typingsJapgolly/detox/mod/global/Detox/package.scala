package typingsJapgolly.detox.mod.global.Detox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CalendarPermission = PermissionState

type CameraPermission = PermissionState

type ContactsPermission = PermissionState

type DetoxAliasedDevice = String | DetoxDeviceConfig

type DetoxConfiguration = DetoxPlainConfiguration | DetoxAliasedConfiguration

type DetoxPlainConfiguration = (DetoxIosSimulatorDriverConfig & DetoxAppConfigFragment & DetoxConfigurationOverrides) | (DetoxIosNoneDriverConfig & DetoxAppConfigFragment & DetoxConfigurationOverrides) | (DetoxAttachedAndroidDriverConfig & DetoxAppConfigFragment & DetoxConfigurationOverrides) | (DetoxAndroidEmulatorDriverConfig & DetoxAppConfigFragment & DetoxConfigurationOverrides) | (DetoxGenymotionCloudDriverConfig & DetoxAppConfigFragment & DetoxConfigurationOverrides) | (DetoxCustomDriverConfig & DetoxConfigurationOverrides)

type ElementFacade = js.Function1[/* by */ NativeMatcher, IndexableNativeElement]

type FaceIDPermission = PermissionState

type HealthPermission = PermissionState

type HomekitPermission = PermissionState

type MediaLibraryPermission = PermissionState

type MicrophonePermission = PermissionState

type MotionPermission = PermissionState

type NativeElement = NativeElementActions

type NotificationsPermission = PermissionState

type PhotosPermission = PermissionState

type RemindersPermission = PermissionState

type SiriPermission = PermissionState

type SpeechPermission = PermissionState

type UserTrackingPermission = PermissionState

type WaitForFacade = js.Function1[/* element */ NativeElement, Expect[WaitFor]]

type WebElement = WebElementActions
