package typingsJapgolly.appiumAdb

import typingsJapgolly.appiumAdb.libAdbMod.ADB
import typingsJapgolly.appiumAdb.libAdbMod.CreateAdbOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("appium-adb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("appium-adb", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def createADB(): js.Promise[ADB] = ^.asInstanceOf[js.Dynamic].applyDynamic("createADB")().asInstanceOf[js.Promise[ADB]]
    inline def createADB(opts: CreateAdbOptions): js.Promise[ADB] = ^.asInstanceOf[js.Dynamic].applyDynamic("createADB")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ADB]]
  }
  
  object ADB {
    
    @JSImport("appium-adb", "ADB")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createADB(): js.Promise[typingsJapgolly.appiumAdb.libAdbMod.ADB] = ^.asInstanceOf[js.Dynamic].applyDynamic("createADB")().asInstanceOf[js.Promise[typingsJapgolly.appiumAdb.libAdbMod.ADB]]
    inline def createADB(opts: CreateAdbOptions): js.Promise[typingsJapgolly.appiumAdb.libAdbMod.ADB] = ^.asInstanceOf[js.Dynamic].applyDynamic("createADB")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.appiumAdb.libAdbMod.ADB]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("appium-adb", "ADB")
  @js.native
  open class ADBCls ()
    extends StObject
       with ADB {
    def this(opts: CreateAdbOptions) = this()
  }
  
  @JSImport("appium-adb", "DEFAULT_ADB_PORT")
  @js.native
  val DEFAULT_ADB_PORT: Double = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("appium-adb", JSImport.Default)
  @js.native
  open class defaultCls ()
    extends StObject
       with ADB {
    def this(opts: CreateAdbOptions) = this()
  }
  
  inline def getAndroidBinaryPath(binaryName: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidBinaryPath")(binaryName.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def getSdkRootFromEnv(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSdkRootFromEnv")().asInstanceOf[js.UndefOr[String]]
}
