package typingsJapgolly.firebaseFirestore

import typingsJapgolly.grpcGrpcJs.buildSrcMakeClientMod.GrpcObject
import typingsJapgolly.protobufjs.mod.IConversionOptions
import typingsJapgolly.protobufjs.mod.Root
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcPlatformNodeLoadProtosMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/load_protos", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def loadProtos(): GrpcObject = ^.asInstanceOf[js.Dynamic].applyDynamic("loadProtos")().asInstanceOf[GrpcObject]
  
  inline def loadRawProtos(): Root = ^.asInstanceOf[js.Dynamic].applyDynamic("loadRawProtos")().asInstanceOf[Root]
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/node/load_protos", "protoLoaderOptions")
  @js.native
  val protoLoaderOptions: IConversionOptions = js.native
}
