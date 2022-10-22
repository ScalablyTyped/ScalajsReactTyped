package typingsJapgolly.reactToolbox

import japgolly.scalajs.react.facade.React.ComponentClassP
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHocActivableRendererMod {
  
  @JSImport("react-toolbox/components/hoc/ActivableRenderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](): (js.Function1[/* target */ ComponentClassP[P & js.Object], ComponentClassP[P & js.Object]]) & (js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ /* clazz */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ Any
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[(js.Function1[/* target */ ComponentClassP[P & js.Object], ComponentClassP[P & js.Object]]) & (js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ /* clazz */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ Any
  ])]
  inline def default[P](options: ActivableRendererFactoryOptions): (js.Function1[/* target */ ComponentClassP[P & js.Object], ComponentClassP[P & js.Object]]) & (js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ /* clazz */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ Any
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[(js.Function1[/* target */ ComponentClassP[P & js.Object], ComponentClassP[P & js.Object]]) & (js.Function1[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ /* clazz */ Any, 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.StatelessComponent<P> */ Any
  ])]
  
  trait ActivableRendererFactoryOptions extends StObject {
    
    var delay: js.UndefOr[Double] = js.undefined
  }
  object ActivableRendererFactoryOptions {
    
    inline def apply(): ActivableRendererFactoryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActivableRendererFactoryOptions]
    }
    
    extension [Self <: ActivableRendererFactoryOptions](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    }
  }
}
