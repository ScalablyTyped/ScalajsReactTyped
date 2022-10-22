package typingsJapgolly.mendixmodelsdk.mod.webservices

import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "webservices.SoapVersion")
@js.native
open class SoapVersion protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.webservices.SoapVersion {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object SoapVersion {
  
  @JSImport("mendixmodelsdk", "webservices.SoapVersion")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.SoapVersion.Soap11")
  @js.native
  def Soap11: typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.SoapVersion = js.native
  inline def Soap11_=(x: typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.SoapVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Soap11")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "webservices.SoapVersion.Soap12")
  @js.native
  def Soap12: typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.SoapVersion = js.native
  inline def Soap12_=(x: typingsJapgolly.mendixmodelsdk.srcGenWebservicesMod.webservices.SoapVersion): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Soap12")(x.asInstanceOf[js.Any])
}
