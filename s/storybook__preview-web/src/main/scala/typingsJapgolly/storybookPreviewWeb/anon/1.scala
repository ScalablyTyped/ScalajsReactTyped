package typingsJapgolly.storybookPreviewWeb.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookPreviewWeb.distTs3Dot9PreviewWebMod.MaybePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  def getProjectAnnotations(): MaybePromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ]
}
object `1` {
  
  inline def apply(
    getProjectAnnotations: CallbackTo[
      MaybePromise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
      ]
    ]
  ): `1` = {
    val __obj = js.Dynamic.literal(getProjectAnnotations = getProjectAnnotations.toJsFn)
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setGetProjectAnnotations(
      value: CallbackTo[
          MaybePromise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
          ]
        ]
    ): Self = StObject.set(x, "getProjectAnnotations", value.toJsFn)
  }
}
