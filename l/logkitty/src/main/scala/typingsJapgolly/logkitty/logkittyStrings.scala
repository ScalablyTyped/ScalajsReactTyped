package typingsJapgolly.logkitty

import typingsJapgolly.logkitty.buildIosConstantsMod.PriorityNames
import typingsJapgolly.logkitty.buildTypesMod.Platform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object logkittyStrings {
  
  @js.native
  sealed trait DEBUG
    extends StObject
       with PriorityNames
       with typingsJapgolly.logkitty.buildAndroidConstantsMod.PriorityNames
  inline def DEBUG: DEBUG = "DEBUG".asInstanceOf[DEBUG]
  
  @js.native
  sealed trait DEFAULT
    extends StObject
       with PriorityNames
  inline def DEFAULT: DEFAULT = "DEFAULT".asInstanceOf[DEFAULT]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with PriorityNames
       with typingsJapgolly.logkitty.buildAndroidConstantsMod.PriorityNames
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait FATAL
    extends StObject
       with typingsJapgolly.logkitty.buildAndroidConstantsMod.PriorityNames
  inline def FATAL: FATAL = "FATAL".asInstanceOf[FATAL]
  
  @js.native
  sealed trait INFO
    extends StObject
       with PriorityNames
       with typingsJapgolly.logkitty.buildAndroidConstantsMod.PriorityNames
  inline def INFO: INFO = "INFO".asInstanceOf[INFO]
  
  @js.native
  sealed trait SILENT
    extends StObject
       with typingsJapgolly.logkitty.buildAndroidConstantsMod.PriorityNames
  inline def SILENT: SILENT = "SILENT".asInstanceOf[SILENT]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with typingsJapgolly.logkitty.buildAndroidConstantsMod.PriorityNames
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait VERBOSE
    extends StObject
       with typingsJapgolly.logkitty.buildAndroidConstantsMod.PriorityNames
  inline def VERBOSE: VERBOSE = "VERBOSE".asInstanceOf[VERBOSE]
  
  @js.native
  sealed trait WARN
    extends StObject
       with typingsJapgolly.logkitty.buildAndroidConstantsMod.PriorityNames
  inline def WARN: WARN = "WARN".asInstanceOf[WARN]
  
  @js.native
  sealed trait android
    extends StObject
       with Platform
  inline def android: android = "android".asInstanceOf[android]
  
  @js.native
  sealed trait ios
    extends StObject
       with Platform
  inline def ios: ios = "ios".asInstanceOf[ios]
}
