package typingsJapgolly.googleCloudSpanner.anon

import org.scalablytyped.runtime.Instantiable0
import typingsJapgolly.googleGax.mod.grpc.ServerCredentials
import typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.KeyCertPair
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofServerCredentials
  extends StObject
     with Instantiable0[ServerCredentials] {
  
  def createInsecure(): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
  
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair]): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Null, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair]): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
  def createSsl(rootCerts: Buffer, keyCertPairs: js.Array[KeyCertPair], checkClientCertificate: Boolean): typingsJapgolly.grpcGrpcJs.buildSrcServerCredentialsMod.ServerCredentials = js.native
}
