package typingsJapgolly.firebaseAppCompat

import org.scalablytyped.runtime.Instantiable2
import typingsJapgolly.firebaseAppCompat.distSrcFirebaseAppMod.FirebaseAppImpl
import typingsJapgolly.firebaseAppCompat.distSrcLiteFirebaseAppLiteMod.FirebaseAppLiteImpl
import typingsJapgolly.firebaseAppCompat.distSrcTypesMod.FirebaseNamespace
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFirebaseNamespaceCoreMod {
  
  @JSImport("@firebase/app-compat/dist/src/firebaseNamespaceCore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createFirebaseNamespaceCore(
    firebaseAppImpl: Instantiable2[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseAppExp */ /* _delegate */ /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseAppExp */ Any, 
      /* firebase */ FirebaseNamespace, 
      FirebaseAppImpl | FirebaseAppLiteImpl
    ]
  ): FirebaseNamespace = ^.asInstanceOf[js.Dynamic].applyDynamic("createFirebaseNamespaceCore")(firebaseAppImpl.asInstanceOf[js.Any]).asInstanceOf[FirebaseNamespace]
}
