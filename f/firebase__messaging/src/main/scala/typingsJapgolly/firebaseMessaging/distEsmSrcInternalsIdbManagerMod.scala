package typingsJapgolly.firebaseMessaging

import typingsJapgolly.firebaseMessaging.distEsmSrcInterfacesInternalDependenciesMod.FirebaseInternalDependencies
import typingsJapgolly.firebaseMessaging.distEsmSrcInterfacesTokenDetailsMod.TokenDetails
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsmSrcInternalsIdbManagerMod {
  
  @JSImport("@firebase/messaging/dist/esm/src/internals/idb-manager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/messaging/dist/esm/src/internals/idb-manager", "DATABASE_NAME")
  @js.native
  val DATABASE_NAME: /* "firebase-messaging-database" */ String = js.native
  
  inline def dbDelete(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dbDelete")().asInstanceOf[js.Promise[Unit]]
  
  inline def dbGet(firebaseDependencies: FirebaseInternalDependencies): js.Promise[js.UndefOr[TokenDetails]] = ^.asInstanceOf[js.Dynamic].applyDynamic("dbGet")(firebaseDependencies.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[TokenDetails]]]
  
  inline def dbRemove(firebaseDependencies: FirebaseInternalDependencies): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("dbRemove")(firebaseDependencies.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def dbSet(firebaseDependencies: FirebaseInternalDependencies, tokenDetails: TokenDetails): js.Promise[TokenDetails] = (^.asInstanceOf[js.Dynamic].applyDynamic("dbSet")(firebaseDependencies.asInstanceOf[js.Any], tokenDetails.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TokenDetails]]
}
