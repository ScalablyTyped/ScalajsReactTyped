package typingsJapgolly.datadogPprof

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outSrcCpuProfilerMod {
  
  @JSImport("@datadog/pprof/out/src/cpu-profiler", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with CpuProfiler {
    
    /* CompleteClass */
    override def profile(): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_profile.perftools.profiles.IProfile */ Any
      ] = js.native
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped any */ trait CpuProfiler extends StObject {
    
    def profile(): js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_profile.perftools.profiles.IProfile */ Any
      ]
  }
  object CpuProfiler {
    
    inline def apply(
      profile: CallbackTo[
          js.UndefOr[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_profile.perftools.profiles.IProfile */ Any
          ]
        ]
    ): CpuProfiler = {
      val __obj = js.Dynamic.literal(profile = profile.toJsFn)
      __obj.asInstanceOf[CpuProfiler]
    }
    
    extension [Self <: CpuProfiler](x: Self) {
      
      inline def setProfile(
        value: CallbackTo[
              js.UndefOr[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_profile.perftools.profiles.IProfile */ Any
              ]
            ]
      ): Self = StObject.set(x, "profile", value.toJsFn)
    }
  }
}
