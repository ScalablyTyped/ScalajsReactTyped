package typingsJapgolly.ngreact

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type ReactDirective = js.Function4[
    /* reactComponentName */ String | (ComponentClassP[Any & js.Object]), 
    /* propNames */ js.UndefOr[js.Array[String]], 
    /* conf */ js.UndefOr[js.Object], 
    /* injectableProps */ js.UndefOr[js.Object], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify angular.IDirective */ Any
  ]
}
