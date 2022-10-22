package typingsJapgolly.cadesplugin

import typingsJapgolly.cadesplugin.CAPICOM.Store
import typingsJapgolly.cadesplugin.CAdESCOM.About
import typingsJapgolly.cadesplugin.CAdESCOM.CPAttribute
import typingsJapgolly.cadesplugin.CAdESCOM.CPHashedData
import typingsJapgolly.cadesplugin.CAdESCOM.CPSigner
import typingsJapgolly.cadesplugin.CAdESCOM.CadesSignedData
import typingsJapgolly.cadesplugin.CAdESCOM.RawSignature
import typingsJapgolly.cadesplugin.CAdESCOM.SignedXML
import typingsJapgolly.cadesplugin.cadespluginStrings.CAPICOMDotStore
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotAbout
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotCPAttribute
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotCPSigner
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotCadesSignedData
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotHashedData
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotRawSignature
import typingsJapgolly.cadesplugin.cadespluginStrings.CAdESCOMDotSignedXML
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADESPluginSync
  extends StObject
     with CADESPluginBase
     with CADESPlugin {
  
  @JSName("CreateObject")
  def CreateObject_CAPICOMStore(objName: CAPICOMDotStore): Store = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMAbout(objName: CAdESCOMDotAbout): About = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMCPAttribute(objName: CAdESCOMDotCPAttribute): CPAttribute = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMCPSigner(objName: CAdESCOMDotCPSigner): CPSigner = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMCadesSignedData(objName: CAdESCOMDotCadesSignedData): CadesSignedData = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMHashedData(objName: CAdESCOMDotHashedData): CPHashedData = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMRawSignature(objName: CAdESCOMDotRawSignature): RawSignature = js.native
  @JSName("CreateObject")
  def CreateObject_CAdESCOMSignedXML(objName: CAdESCOMDotSignedXML): SignedXML = js.native
}
