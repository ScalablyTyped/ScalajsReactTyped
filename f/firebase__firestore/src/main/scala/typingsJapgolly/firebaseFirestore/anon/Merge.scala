package typingsJapgolly.firebaseFirestore.anon

import typingsJapgolly.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.SetOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Merge
  extends StObject
     with SetOptions
     with typingsJapgolly.firebaseFirestore.mod.SetOptions
     with typingsJapgolly.firebaseFirestore.distLiteInternalMod.SetOptions
     with typingsJapgolly.firebaseFirestore.distInternalMod.SetOptions
     with typingsJapgolly.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.SetOptions
     with typingsJapgolly.firebaseFirestore.distLiteMod.SetOptions
     with typingsJapgolly.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.SetOptions
     with typingsJapgolly.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.SetOptions
     with typingsJapgolly.firebaseFirestore.distLitePrivateMod.SetOptions
     with typingsJapgolly.firebaseFirestore.distPrivateMod.SetOptions {
  
  val merge: js.UndefOr[Boolean] = js.undefined
}
object Merge {
  
  inline def apply(): Merge = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Merge]
  }
  
  extension [Self <: Merge](x: Self) {
    
    inline def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    inline def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
  }
}
