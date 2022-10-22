package typingsJapgolly.cadesplugin

import typingsJapgolly.cadesplugin.CAPICOM.StoreAsync
import typingsJapgolly.cadesplugin.CAdESCOM.AboutAsync
import typingsJapgolly.cadesplugin.CAdESCOM.CPAttributeAsync
import typingsJapgolly.cadesplugin.CAdESCOM.CPHashedDataAsync
import typingsJapgolly.cadesplugin.CAdESCOM.CPSignerAsync
import typingsJapgolly.cadesplugin.CAdESCOM.CadesSignedDataAsync
import typingsJapgolly.cadesplugin.CAdESCOM.RawSignatureAsync
import typingsJapgolly.cadesplugin.CAdESCOM.SignedXMLAsync
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotAbout
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotCPAttribute
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotCPSigner
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotCadesSignedData
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotHashedData
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotRawSignature
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotSignedXML
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotStore
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESPluginAsync
  extends StObject
     with CADESPluginBase
     with CADESPlugin {
  
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMAbout(objName: CAdESCOMDotAbout): js.Promise[AboutAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMCPAttribute(objName: CAdESCOMDotCPAttribute): js.Promise[CPAttributeAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMCPSigner(objName: CAdESCOMDotCPSigner): js.Promise[CPSignerAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMCadesSignedData(objName: CAdESCOMDotCadesSignedData): js.Promise[CadesSignedDataAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMHashedData(objName: CAdESCOMDotHashedData): js.Promise[CPHashedDataAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMRawSignature(objName: CAdESCOMDotRawSignature): js.Promise[RawSignatureAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMSignedXML(objName: CAdESCOMDotSignedXML): js.Promise[SignedXMLAsync] = js.native
  @JSName("CreateObjectAsync")
  def CreateObjectAsync_CAdESCOMStore(objName: CAdESCOMDotStore): js.Promise[StoreAsync] = js.native
  
  def ReleasePluginObjects(): js.Promise[Boolean] = js.native
}
