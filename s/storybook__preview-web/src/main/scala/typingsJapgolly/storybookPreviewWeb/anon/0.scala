package typingsJapgolly.storybookPreviewWeb.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.storybookPreviewWeb.distTs3Dot9PreviewMod.MaybePromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  def getProjectAnnotations(): MaybePromise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
  ]
}
object `0` {
  
  inline def apply(
    getProjectAnnotations: CallbackTo[
      MaybePromise[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
      ]
    ]
  ): `0` = {
    val __obj = js.Dynamic.literal(getProjectAnnotations = getProjectAnnotations.toJsFn)
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setGetProjectAnnotations(
      value: CallbackTo[
          MaybePromise[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ProjectAnnotations<TFramework> */ Any
          ]
        ]
    ): Self = StObject.set(x, "getProjectAnnotations", value.toJsFn)
  }
}
