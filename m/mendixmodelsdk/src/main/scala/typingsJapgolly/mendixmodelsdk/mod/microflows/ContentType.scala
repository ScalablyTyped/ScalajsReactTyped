package typingsJapgolly.mendixmodelsdk.mod.microflows

import typingsJapgolly.mendixmodelsdk.srcSdkInternalVersionChecksMod.ILifeCycle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mendixmodelsdk", "microflows.ContentType")
@js.native
open class ContentType protected ()
  extends typingsJapgolly.mendixmodelsdk.srcGenAllModelClassesMod.microflows.ContentType {
  def this(_name: String, lifeCycleInfo: ILifeCycle) = this()
}
object ContentType {
  
  @JSImport("mendixmodelsdk", "microflows.ContentType")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ContentType.Json")
  @js.native
  def Json: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContentType = js.native
  inline def Json_=(x: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Json")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("mendixmodelsdk", "microflows.ContentType.Xml")
  @js.native
  def Xml: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContentType = js.native
  inline def Xml_=(x: typingsJapgolly.mendixmodelsdk.srcGenMicroflowsMod.microflows.ContentType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Xml")(x.asInstanceOf[js.Any])
}
