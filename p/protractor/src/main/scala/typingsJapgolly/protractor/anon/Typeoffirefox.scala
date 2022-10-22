package typingsJapgolly.protractor.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.seleniumWebdriver.remoteMod.DriverService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoffirefox extends StObject {
  
  var Driver: TypeofDriver = js.native
  
  var Options: Instantiable0[typingsJapgolly.seleniumWebdriver.firefoxMod.Options] = js.native
  
  var ServiceBuilder: Instantiable0[typingsJapgolly.seleniumWebdriver.firefoxMod.ServiceBuilder] = js.native
  
  def createWiresService(binary: String): DriverService = js.native
  def createWiresService(binary: Any): DriverService = js.native
  
  def findWires(): String = js.native
  
  def prepareProfile(profile: String, port: Double): Any = js.native
  def prepareProfile(profile: Any, port: Double): Any = js.native
}
