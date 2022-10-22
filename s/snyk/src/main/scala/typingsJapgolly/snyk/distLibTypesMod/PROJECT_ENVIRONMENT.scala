package typingsJapgolly.snyk.distLibTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PROJECT_ENVIRONMENT extends StObject
@JSImport("snyk/dist/lib/types", "PROJECT_ENVIRONMENT")
@js.native
object PROJECT_ENVIRONMENT extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[PROJECT_ENVIRONMENT & String] = js.native
  
  @js.native
  sealed trait BACKEND
    extends StObject
       with PROJECT_ENVIRONMENT
  /* "backend" */ val BACKEND: typingsJapgolly.snyk.distLibTypesMod.PROJECT_ENVIRONMENT.BACKEND & String = js.native
  
  @js.native
  sealed trait DISTRIBUTED
    extends StObject
       with PROJECT_ENVIRONMENT
  /* "distributed" */ val DISTRIBUTED: typingsJapgolly.snyk.distLibTypesMod.PROJECT_ENVIRONMENT.DISTRIBUTED & String = js.native
  
  @js.native
  sealed trait EXTERNAL
    extends StObject
       with PROJECT_ENVIRONMENT
  /* "external" */ val EXTERNAL: typingsJapgolly.snyk.distLibTypesMod.PROJECT_ENVIRONMENT.EXTERNAL & String = js.native
  
  @js.native
  sealed trait FRONTEND
    extends StObject
       with PROJECT_ENVIRONMENT
  /* "frontend" */ val FRONTEND: typingsJapgolly.snyk.distLibTypesMod.PROJECT_ENVIRONMENT.FRONTEND & String = js.native
  
  @js.native
  sealed trait HOSTED
    extends StObject
       with PROJECT_ENVIRONMENT
  /* "hosted" */ val HOSTED: typingsJapgolly.snyk.distLibTypesMod.PROJECT_ENVIRONMENT.HOSTED & String = js.native
  
  @js.native
  sealed trait INTERNAL
    extends StObject
       with PROJECT_ENVIRONMENT
  /* "internal" */ val INTERNAL: typingsJapgolly.snyk.distLibTypesMod.PROJECT_ENVIRONMENT.INTERNAL & String = js.native
  
  @js.native
  sealed trait MOBILE
    extends StObject
       with PROJECT_ENVIRONMENT
  /* "mobile" */ val MOBILE: typingsJapgolly.snyk.distLibTypesMod.PROJECT_ENVIRONMENT.MOBILE & String = js.native
  
  @js.native
  sealed trait ONPREM
    extends StObject
       with PROJECT_ENVIRONMENT
  /* "onprem" */ val ONPREM: typingsJapgolly.snyk.distLibTypesMod.PROJECT_ENVIRONMENT.ONPREM & String = js.native
  
  @js.native
  sealed trait SAAS
    extends StObject
       with PROJECT_ENVIRONMENT
  /* "saas" */ val SAAS: typingsJapgolly.snyk.distLibTypesMod.PROJECT_ENVIRONMENT.SAAS & String = js.native
}
