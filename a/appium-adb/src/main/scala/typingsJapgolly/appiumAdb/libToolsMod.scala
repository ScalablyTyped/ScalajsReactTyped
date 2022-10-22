package typingsJapgolly.appiumAdb

import typingsJapgolly.appiumAdb.libToolsAabUtilsMod.AabUtils
import typingsJapgolly.appiumAdb.libToolsAdbCommandsMod.AdbCommands
import typingsJapgolly.appiumAdb.libToolsAdbEmuCommandsMod.AdbEmuCommands
import typingsJapgolly.appiumAdb.libToolsAndroidManifestMod.AndroidManifest
import typingsJapgolly.appiumAdb.libToolsApkSigningMod.ApkSigning
import typingsJapgolly.appiumAdb.libToolsApkUtilsMod.ApkUtils
import typingsJapgolly.appiumAdb.libToolsApksUtilsMod.ApksUtils
import typingsJapgolly.appiumAdb.libToolsKeyboardCommandsMod.KeyboardCommands
import typingsJapgolly.appiumAdb.libToolsLockmgmtMod.LockMgmt
import typingsJapgolly.appiumAdb.libToolsSettingsClientCommandsMod.SettingsClientCommands
import typingsJapgolly.appiumAdb.libToolsSystemCallsMod.SystemCalls
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToolsMod {
  
  @JSImport("appium-adb/lib/tools", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("appium-adb/lib/tools", JSImport.Default)
  @js.native
  val default: AdbMethods = js.native
  
  inline def getAndroidBinaryPath(binaryName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidBinaryPath")(binaryName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  @js.native
  trait AdbMethods
    extends StObject
       with AdbCommands
       with AndroidManifest
       with SystemCalls
       with ApkSigning
       with ApkUtils
       with ApksUtils
       with AabUtils
       with AdbEmuCommands
       with SettingsClientCommands
       with LockMgmt
       with KeyboardCommands {
    
    /**
      * Retrieve the screen lock state of the device under test.
      *
      * @return True if the device is locked.
      */
    /* InferMemberOverrides */
    override def isScreenLocked(): js.Promise[Boolean] = js.native
    
    /**
      * Change the state of Data transfer on the device under test.
      *
      * @param on - True to enable and false to disable it.
      * @param isEmulator [false] - Set it to true if the device under test
      *                                       is an emulator rather than a real device.
      */
    /* InferMemberOverrides */
    override def setDataState(on: Boolean): js.Promise[Unit] = js.native
    /* InferMemberOverrides */
    override def setDataState(on: Boolean, isEmulator: Boolean): js.Promise[Unit] = js.native
  }
}
