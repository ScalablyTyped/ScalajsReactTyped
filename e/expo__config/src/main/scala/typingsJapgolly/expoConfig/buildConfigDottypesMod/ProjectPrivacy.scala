package typingsJapgolly.expoConfig.buildConfigDottypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ProjectPrivacy extends StObject
@JSImport("@expo/config/build/Config.types", "ProjectPrivacy")
@js.native
object ProjectPrivacy extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ProjectPrivacy & String] = js.native
  
  @js.native
  sealed trait PUBLIC
    extends StObject
       with ProjectPrivacy
  /* "public" */ val PUBLIC: typingsJapgolly.expoConfig.buildConfigDottypesMod.ProjectPrivacy.PUBLIC & String = js.native
  
  @js.native
  sealed trait UNLISTED
    extends StObject
       with ProjectPrivacy
  /* "unlisted" */ val UNLISTED: typingsJapgolly.expoConfig.buildConfigDottypesMod.ProjectPrivacy.UNLISTED & String = js.native
}
