package typingsJapgolly.contentstackUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesNodesNodeTypeMod {
  
  @JSImport("@contentstack/utils/dist/types/nodes/node-type", JSImport.Default)
  @js.native
  object default extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NodeType & String] = js.native
    
    /* "blockquote" */ val BLOCK_QUOTE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.BLOCK_QUOTE & String = js.native
    
    /* "code" */ val CODE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.CODE & String = js.native
    
    /* "doc" */ val DOCUMENT: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.DOCUMENT & String = js.native
    
    /* "embed" */ val EMBED: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.EMBED & String = js.native
    
    /* "h1" */ val HEADING_1: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_1 & String = js.native
    
    /* "h2" */ val HEADING_2: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_2 & String = js.native
    
    /* "h3" */ val HEADING_3: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_3 & String = js.native
    
    /* "h4" */ val HEADING_4: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_4 & String = js.native
    
    /* "h5" */ val HEADING_5: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_5 & String = js.native
    
    /* "h6" */ val HEADING_6: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HEADING_6 & String = js.native
    
    /* "hr" */ val HR: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.HR & String = js.native
    
    /* "img" */ val IMAGE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.IMAGE & String = js.native
    
    /* "a" */ val LINK: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.LINK & String = js.native
    
    /* "li" */ val LIST_ITEM: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.LIST_ITEM & String = js.native
    
    /* "ol" */ val ORDER_LIST: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.ORDER_LIST & String = js.native
    
    /* "p" */ val PARAGRAPH: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.PARAGRAPH & String = js.native
    
    /* "reference" */ val REFERENCE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.REFERENCE & String = js.native
    
    /* "table" */ val TABLE: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE & String = js.native
    
    /* "tbody" */ val TABLE_BODY: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_BODY & String = js.native
    
    /* "td" */ val TABLE_DATA: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_DATA & String = js.native
    
    /* "tfoot" */ val TABLE_FOOTER: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_FOOTER & String = js.native
    
    /* "th" */ val TABLE_HEAD: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_HEAD & String = js.native
    
    /* "thead" */ val TABLE_HEADER: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_HEADER & String = js.native
    
    /* "tr" */ val TABLE_ROW: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TABLE_ROW & String = js.native
    
    /* "text" */ val TEXT: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.TEXT & String = js.native
    
    /* "ul" */ val UNORDER_LIST: typingsJapgolly.contentstackUtils.distTypesNodesNodeTypeMod.NodeType.UNORDER_LIST & String = js.native
  }
  
  @js.native
  sealed trait NodeType extends StObject
  @JSImport("@contentstack/utils/dist/types/nodes/node-type", "NodeType")
  @js.native
  object NodeType extends StObject {
    
    @js.native
    sealed trait BLOCK_QUOTE
      extends StObject
         with NodeType
    
    @js.native
    sealed trait CODE
      extends StObject
         with NodeType
    
    @js.native
    sealed trait DOCUMENT
      extends StObject
         with NodeType
    
    @js.native
    sealed trait EMBED
      extends StObject
         with NodeType
    
    @js.native
    sealed trait HEADING_1
      extends StObject
         with NodeType
    
    @js.native
    sealed trait HEADING_2
      extends StObject
         with NodeType
    
    @js.native
    sealed trait HEADING_3
      extends StObject
         with NodeType
    
    @js.native
    sealed trait HEADING_4
      extends StObject
         with NodeType
    
    @js.native
    sealed trait HEADING_5
      extends StObject
         with NodeType
    
    @js.native
    sealed trait HEADING_6
      extends StObject
         with NodeType
    
    @js.native
    sealed trait HR
      extends StObject
         with NodeType
    
    @js.native
    sealed trait IMAGE
      extends StObject
         with NodeType
    
    @js.native
    sealed trait LINK
      extends StObject
         with NodeType
    
    @js.native
    sealed trait LIST_ITEM
      extends StObject
         with NodeType
    
    @js.native
    sealed trait ORDER_LIST
      extends StObject
         with NodeType
    
    @js.native
    sealed trait PARAGRAPH
      extends StObject
         with NodeType
    
    @js.native
    sealed trait REFERENCE
      extends StObject
         with NodeType
    
    @js.native
    sealed trait TABLE
      extends StObject
         with NodeType
    
    @js.native
    sealed trait TABLE_BODY
      extends StObject
         with NodeType
    
    @js.native
    sealed trait TABLE_DATA
      extends StObject
         with NodeType
    
    @js.native
    sealed trait TABLE_FOOTER
      extends StObject
         with NodeType
    
    @js.native
    sealed trait TABLE_HEAD
      extends StObject
         with NodeType
    
    @js.native
    sealed trait TABLE_HEADER
      extends StObject
         with NodeType
    
    @js.native
    sealed trait TABLE_ROW
      extends StObject
         with NodeType
    
    @js.native
    sealed trait TEXT
      extends StObject
         with NodeType
    
    @js.native
    sealed trait UNORDER_LIST
      extends StObject
         with NodeType
  }
}
