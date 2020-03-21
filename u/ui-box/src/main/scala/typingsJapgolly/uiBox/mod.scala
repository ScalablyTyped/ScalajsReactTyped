package typingsJapgolly.uiBox

import typingsJapgolly.uiBox.boxTypesMod.BoxComponent
import typingsJapgolly.uiBox.cacheMod.CacheEntry
import typingsJapgolly.uiBox.splitBoxPropsMod.SplitBoxProps
import typingsJapgolly.uiBox.splitPropsMod.Dictionary
import typingsJapgolly.uiBox.splitPropsMod.SplitProps
import typingsJapgolly.uiBox.typesEnhancersMod.EnhancerProps
import typingsJapgolly.uiBox.typesEnhancersMod.PropAliases
import typingsJapgolly.uiBox.typesEnhancersMod.PropEnhancers
import typingsJapgolly.uiBox.typesEnhancersMod.PropTypesMapping
import typingsJapgolly.uiBox.typesEnhancersMod.PropValidators
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ui-box", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val default: BoxComponent = js.native
  val hydrate: js.Function1[/* newEntries */ js.Array[CacheEntry], Unit] = js.native
  val propAliases: PropAliases = js.native
  val propEnhancers: PropEnhancers = js.native
  val propNames: js.Array[String] = js.native
  val propTypes: PropTypesMapping = js.native
  def clearStyles(): Unit = js.native
  def extractStyles(): AnonCache = js.native
  def splitBoxProps[P /* <: EnhancerProps */](props: P): SplitBoxProps[P] = js.native
  def splitProps[P /* <: Dictionary[_] */, K /* <: String */](props: P, keys: js.Array[K]): SplitProps[P, K] = js.native
  @js.native
  object background extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object borderRadius extends js.Object {
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
    @js.native
    object propAliases extends js.Object {
      var borderRadius: js.Array[String] = js.native
    }
    
  }
  
  @js.native
  object borders extends js.Object {
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
    @js.native
    object propAliases extends js.Object {
      var border: js.Array[String] = js.native
      var borderColor: js.Array[String] = js.native
      var borderStyle: js.Array[String] = js.native
      var borderWidth: js.Array[String] = js.native
    }
    
  }
  
  @js.native
  object boxShadow extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object dimensions extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object flex extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object interaction extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object layout extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object list extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object opacity extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object overflow extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object position extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object spacing extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object text extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
  @js.native
  object transform extends js.Object {
    val propAliases: PropAliases = js.native
    val propEnhancers: PropEnhancers = js.native
    val propTypes: PropTypesMapping = js.native
    val propValidators: PropValidators = js.native
  }
  
}

