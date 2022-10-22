package typingsJapgolly.yaml

import typingsJapgolly.yaml.anon.ScalarTagtestRegExp
import typingsJapgolly.yaml.distSchemaTypesMod.CollectionTag
import typingsJapgolly.yaml.distSchemaTypesMod.ScalarTag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSchemaTagsMod {
  
  @JSImport("yaml/dist/schema/tags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object coreKnownTags {
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:binary")
    @js.native
    def tagYamlOrg2002Binary: ScalarTag = js.native
    
    inline def tagYamlOrg2002Binary_=(x: ScalarTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:binary")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:omap")
    @js.native
    def tagYamlOrg2002Omap: CollectionTag = js.native
    
    inline def tagYamlOrg2002Omap_=(x: CollectionTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:omap")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:pairs")
    @js.native
    def tagYamlOrg2002Pairs: CollectionTag = js.native
    
    inline def tagYamlOrg2002Pairs_=(x: CollectionTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:pairs")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:set")
    @js.native
    def tagYamlOrg2002Set: CollectionTag = js.native
    
    inline def tagYamlOrg2002Set_=(x: CollectionTag): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:set")(x.asInstanceOf[js.Any])
    
    @JSImport("yaml/dist/schema/tags", "coreKnownTags.tag:yaml.org,2002:timestamp")
    @js.native
    def tagYamlOrg2002Timestamp: ScalarTagtestRegExp = js.native
    
    inline def tagYamlOrg2002Timestamp_=(x: ScalarTagtestRegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag:yaml.org,2002:timestamp")(x.asInstanceOf[js.Any])
  }
  
  inline def getTags(customTags: js.UndefOr[Tags | (js.Function1[/* tags */ Tags, Tags]) | Null], schemaName: String): js.Array[ScalarTag | CollectionTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTags")(customTags.asInstanceOf[js.Any], schemaName.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScalarTag | CollectionTag]]
  inline def getTags(customTags: Unit, schemaName: String): js.Array[ScalarTag | CollectionTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTags")(customTags.asInstanceOf[js.Any], schemaName.asInstanceOf[js.Any])).asInstanceOf[js.Array[ScalarTag | CollectionTag]]
  
  /* keyof yaml.anon.Binary */ /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.yaml.yamlStrings.binary
    - typingsJapgolly.yaml.yamlStrings.bool
    - typingsJapgolly.yaml.yamlStrings.float
    - typingsJapgolly.yaml.yamlStrings.floatExp
    - typingsJapgolly.yaml.yamlStrings.floatNaN
    - typingsJapgolly.yaml.yamlStrings.floatTime
    - typingsJapgolly.yaml.yamlStrings.int
    - typingsJapgolly.yaml.yamlStrings.intHex
    - typingsJapgolly.yaml.yamlStrings.intOct
    - typingsJapgolly.yaml.yamlStrings.intTime
    - typingsJapgolly.yaml.yamlStrings.map
    - typingsJapgolly.yaml.yamlStrings.`null`
    - typingsJapgolly.yaml.yamlStrings.omap
    - typingsJapgolly.yaml.yamlStrings.pairs
    - typingsJapgolly.yaml.yamlStrings.seq
    - typingsJapgolly.yaml.yamlStrings.set
    - typingsJapgolly.yaml.yamlStrings.timestamp
  */
  trait TagId extends StObject
  
  type Tags = js.Array[ScalarTag | CollectionTag | TagId]
}
