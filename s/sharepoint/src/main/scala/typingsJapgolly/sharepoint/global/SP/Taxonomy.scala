package typingsJapgolly.sharepoint.global.SP

import typingsJapgolly.sharepoint.IEnumerator
import typingsJapgolly.sharepoint.SP.FieldCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Taxonomy {
  
  @JSGlobal("SP.Taxonomy.ChangeInformation")
  @js.native
  open class ChangeInformation protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.ChangeInformation {
    def this(context: typingsJapgolly.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.ChangeItemType")
  @js.native
  object ChangeItemType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Taxonomy.ChangeItemType & Double] = js.native
    
    /* 3 */ val group: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeItemType.group & Double = js.native
    
    /* 5 */ val site: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeItemType.site & Double = js.native
    
    /* 1 */ val term: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeItemType.term & Double = js.native
    
    /* 2 */ val termSet: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeItemType.termSet & Double = js.native
    
    /* 4 */ val termStore: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeItemType.termStore & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeItemType.unknown & Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.ChangeOperationType")
  @js.native
  object ChangeOperationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType & Double] = js.native
    
    /* 1 */ val add: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.add & Double = js.native
    
    /* 5 */ val copy: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.copy & Double = js.native
    
    /* 3 */ val deleteObject: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.deleteObject & Double = js.native
    
    /* 2 */ val edit: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.edit & Double = js.native
    
    /* 8 */ val importObject: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.importObject & Double = js.native
    
    /* 7 */ val merge: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.merge & Double = js.native
    
    /* 4 */ val move: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.move & Double = js.native
    
    /* 6 */ val pathChange: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.pathChange & Double = js.native
    
    /* 9 */ val restore: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.restore & Double = js.native
    
    /* 0 */ val unknown: typingsJapgolly.sharepoint.SP.Taxonomy.ChangeOperationType.unknown & Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.ChangedGroup")
  @js.native
  open class ChangedGroup ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.ChangedItem
  
  @JSGlobal("SP.Taxonomy.ChangedItem")
  @js.native
  open class ChangedItem ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.ChangedItem
  
  @JSGlobal("SP.Taxonomy.ChangedSite")
  @js.native
  open class ChangedSite ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.ChangedSite
  
  @JSGlobal("SP.Taxonomy.ChangedTerm")
  @js.native
  open class ChangedTerm ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.ChangedTerm
  
  @JSGlobal("SP.Taxonomy.ChangedTermSet")
  @js.native
  open class ChangedTermSet ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.ChangedTermSet
  
  @JSGlobal("SP.Taxonomy.ChangedTermStore")
  @js.native
  open class ChangedTermStore ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.ChangedTermStore
  
  @JSGlobal("SP.Taxonomy.CustomPropertyMatchInformation")
  @js.native
  open class CustomPropertyMatchInformation protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.CustomPropertyMatchInformation {
    def this(context: typingsJapgolly.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.Label")
  @js.native
  open class Label ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.Label
  
  @JSGlobal("SP.Taxonomy.LabelMatchInformation")
  @js.native
  open class LabelMatchInformation protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.LabelMatchInformation {
    def this(context: typingsJapgolly.sharepoint.SP.ClientContext) = this()
  }
  
  @JSGlobal("SP.Taxonomy.MobileTaxonomyField")
  @js.native
  open class MobileTaxonomyField ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.MobileTaxonomyField
  
  @JSGlobal("SP.Taxonomy.StringMatchOption")
  @js.native
  object StringMatchOption extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typingsJapgolly.sharepoint.SP.Taxonomy.StringMatchOption & Double] = js.native
    
    /* 1 */ val exactMatch: typingsJapgolly.sharepoint.SP.Taxonomy.StringMatchOption.exactMatch & Double = js.native
    
    /* 0 */ val startsWith: typingsJapgolly.sharepoint.SP.Taxonomy.StringMatchOption.startsWith & Double = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyField")
  @js.native
  open class TaxonomyField protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.TaxonomyField {
    def this(context: typingsJapgolly.sharepoint.SP.ClientContext, fields: FieldCollection, filedName: String) = this()
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyFieldValue")
  @js.native
  open class TaxonomyFieldValue ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.TaxonomyFieldValue {
    
    /* CompleteClass */
    override def customFromJson(obj: Any): Boolean = js.native
    
    /* CompleteClass */
    override def customWriteToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Boolean = js.native
    
    /* CompleteClass */
    override def fromJson(obj: Any): Unit = js.native
    
    /* CompleteClass */
    override def get_label(): String = js.native
    
    /* CompleteClass */
    override def get_termGuid(): typingsJapgolly.sharepoint.SP.Guid = js.native
    
    /* CompleteClass */
    override def get_typeId(): String = js.native
    
    /* CompleteClass */
    override def get_wssId(): Double = js.native
    
    /* CompleteClass */
    override def set_label(value: String): Unit = js.native
    
    /* CompleteClass */
    override def set_termGuid(value: typingsJapgolly.sharepoint.SP.Guid): Unit = js.native
    
    /* CompleteClass */
    override def set_wssId(value: Double): Unit = js.native
    
    /* CompleteClass */
    override def writeToXml(
      writer: typingsJapgolly.sharepoint.SP.XmlWriter,
      serializationContext: typingsJapgolly.sharepoint.SP.SerializationContext
    ): Unit = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyFieldValueCollection")
  @js.native
  open class TaxonomyFieldValueCollection protected ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.TaxonomyFieldValueCollection {
    def this(
      context: typingsJapgolly.sharepoint.SP.ClientContext,
      fieldValue: String,
      creatingField: typingsJapgolly.sharepoint.SP.Field
    ) = this()
    
    /* CompleteClass */
    override def getEnumerator(): IEnumerator[typingsJapgolly.sharepoint.SP.Taxonomy.TaxonomyFieldValue] = js.native
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomyItem")
  @js.native
  open class TaxonomyItem ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.TaxonomyItem
  object TaxonomyItem {
    
    @JSGlobal("SP.Taxonomy.TaxonomyItem")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def normalizeName(context: typingsJapgolly.sharepoint.SP.ClientContext, name: String): typingsJapgolly.sharepoint.SP.StringResult = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeName")(context.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.sharepoint.SP.StringResult]
  }
  
  @JSGlobal("SP.Taxonomy.TaxonomySession")
  @js.native
  open class TaxonomySession ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.TaxonomySession
  object TaxonomySession {
    
    @JSGlobal("SP.Taxonomy.TaxonomySession")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getTaxonomySession(context: typingsJapgolly.sharepoint.SP.ClientContext): typingsJapgolly.sharepoint.SP.Taxonomy.TaxonomySession = ^.asInstanceOf[js.Dynamic].applyDynamic("getTaxonomySession")(context.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.sharepoint.SP.Taxonomy.TaxonomySession]
  }
  
  @JSGlobal("SP.Taxonomy.Term")
  @js.native
  open class Term ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.Term
  
  @JSGlobal("SP.Taxonomy.TermGroup")
  @js.native
  open class TermGroup ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.TermGroup
  
  @JSGlobal("SP.Taxonomy.TermSet")
  @js.native
  open class TermSet ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.TermSet
  
  @JSGlobal("SP.Taxonomy.TermSetItem")
  @js.native
  open class TermSetItem ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.TermSetItem
  
  @JSGlobal("SP.Taxonomy.TermStore")
  @js.native
  open class TermStore ()
    extends StObject
       with typingsJapgolly.sharepoint.SP.Taxonomy.TermStore
}
