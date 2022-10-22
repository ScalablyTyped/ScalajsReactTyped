package typingsJapgolly.dxf

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dxf.handlersEntitiesMod.Entity
import typingsJapgolly.dxf.handlersEntitiesMod.LayerGroupedEntities
import typingsJapgolly.dxf.informationMod.FileInfo
import typingsJapgolly.dxf.informationMod.Polyline
import typingsJapgolly.dxf.informationMod.Property
import typingsJapgolly.dxf.informationMod.SVG
import typingsJapgolly.dxf.informationMod.Section
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("dxf/Helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("dxf/Helper", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Helper {
    def this(contents: String) = this()
    
    /* private */ /* CompleteClass */
    var _contents: String = js.native
    
    /* private */ /* CompleteClass */
    var _denormalised: js.Array[Entity] | Null = js.native
    
    /* private */ /* CompleteClass */
    var _groups: LayerGroupedEntities | Null = js.native
    
    /* private */ /* CompleteClass */
    var _parsed: FileInfo | Null = js.native
    
    /* CompleteClass */
    var contents: String = js.native
    
    /* CompleteClass */
    override def denormalise(): js.Array[Entity] | Null = js.native
    
    /* CompleteClass */
    var denormalised: js.Array[Entity] | Null = js.native
    
    /* CompleteClass */
    override def group(): LayerGroupedEntities | Null = js.native
    
    /* CompleteClass */
    var groups: LayerGroupedEntities | Null = js.native
    
    /* CompleteClass */
    override def parse(): FileInfo | Null = js.native
    
    /* CompleteClass */
    var parsed: FileInfo | Null = js.native
    
    /* CompleteClass */
    override def toPolylines(): js.Array[Polyline] = js.native
    
    /* CompleteClass */
    override def toSVG(): SVG = js.native
  }
  
  inline def convertToTypesAndValues(contentLines: String): js.Array[Property] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertToTypesAndValues")(contentLines.asInstanceOf[js.Any]).asInstanceOf[js.Array[Property]]
  
  inline def parseValue(`type`: Double, value: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("parseValue")(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def reduceSection(acc: js.Array[Section], section: Section): js.Array[Section] = (^.asInstanceOf[js.Dynamic].applyDynamic("reduceSection")(acc.asInstanceOf[js.Any], section.asInstanceOf[js.Any])).asInstanceOf[js.Array[Section]]
  
  inline def separateSections(sections: js.Array[Section]): js.Array[Section] = ^.asInstanceOf[js.Dynamic].applyDynamic("separateSections")(sections.asInstanceOf[js.Any]).asInstanceOf[js.Array[Section]]
  
  trait Helper extends StObject {
    
    /* private */ var _contents: String
    
    /* private */ var _denormalised: js.Array[Entity] | Null
    
    /* private */ var _groups: LayerGroupedEntities | Null
    
    /* private */ var _parsed: FileInfo | Null
    
    var contents: String
    
    def denormalise(): js.Array[Entity] | Null
    
    var denormalised: js.Array[Entity] | Null
    
    def group(): LayerGroupedEntities | Null
    
    var groups: LayerGroupedEntities | Null
    
    def parse(): FileInfo | Null
    
    var parsed: FileInfo | Null
    
    def toPolylines(): js.Array[Polyline]
    
    def toSVG(): SVG
  }
  object Helper {
    
    inline def apply(
      _contents: String,
      contents: String,
      denormalise: CallbackTo[js.Array[Entity] | Null],
      group: CallbackTo[LayerGroupedEntities | Null],
      parse: CallbackTo[FileInfo | Null],
      toPolylines: CallbackTo[js.Array[Polyline]],
      toSVG: CallbackTo[SVG]
    ): Helper = {
      val __obj = js.Dynamic.literal(_contents = _contents.asInstanceOf[js.Any], contents = contents.asInstanceOf[js.Any], denormalise = denormalise.toJsFn, group = group.toJsFn, parse = parse.toJsFn, toPolylines = toPolylines.toJsFn, toSVG = toSVG.toJsFn, _denormalised = null, _groups = null, _parsed = null, denormalised = null, groups = null, parsed = null)
      __obj.asInstanceOf[Helper]
    }
    
    extension [Self <: Helper](x: Self) {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setDenormalise(value: CallbackTo[js.Array[Entity] | Null]): Self = StObject.set(x, "denormalise", value.toJsFn)
      
      inline def setDenormalised(value: js.Array[Entity]): Self = StObject.set(x, "denormalised", value.asInstanceOf[js.Any])
      
      inline def setDenormalisedNull: Self = StObject.set(x, "denormalised", null)
      
      inline def setDenormalisedVarargs(value: Entity*): Self = StObject.set(x, "denormalised", js.Array(value*))
      
      inline def setGroup(value: CallbackTo[LayerGroupedEntities | Null]): Self = StObject.set(x, "group", value.toJsFn)
      
      inline def setGroups(value: LayerGroupedEntities): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsNull: Self = StObject.set(x, "groups", null)
      
      inline def setParse(value: CallbackTo[FileInfo | Null]): Self = StObject.set(x, "parse", value.toJsFn)
      
      inline def setParsed(value: FileInfo): Self = StObject.set(x, "parsed", value.asInstanceOf[js.Any])
      
      inline def setParsedNull: Self = StObject.set(x, "parsed", null)
      
      inline def setToPolylines(value: CallbackTo[js.Array[Polyline]]): Self = StObject.set(x, "toPolylines", value.toJsFn)
      
      inline def setToSVG(value: CallbackTo[SVG]): Self = StObject.set(x, "toSVG", value.toJsFn)
      
      inline def set_contents(value: String): Self = StObject.set(x, "_contents", value.asInstanceOf[js.Any])
      
      inline def set_denormalised(value: js.Array[Entity]): Self = StObject.set(x, "_denormalised", value.asInstanceOf[js.Any])
      
      inline def set_denormalisedNull: Self = StObject.set(x, "_denormalised", null)
      
      inline def set_denormalisedVarargs(value: Entity*): Self = StObject.set(x, "_denormalised", js.Array(value*))
      
      inline def set_groups(value: LayerGroupedEntities): Self = StObject.set(x, "_groups", value.asInstanceOf[js.Any])
      
      inline def set_groupsNull: Self = StObject.set(x, "_groups", null)
      
      inline def set_parsed(value: FileInfo): Self = StObject.set(x, "_parsed", value.asInstanceOf[js.Any])
      
      inline def set_parsedNull: Self = StObject.set(x, "_parsed", null)
    }
  }
}
