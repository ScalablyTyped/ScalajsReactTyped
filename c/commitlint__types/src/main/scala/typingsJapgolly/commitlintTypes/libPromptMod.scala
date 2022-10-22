package typingsJapgolly.commitlintTypes

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.commitlintTypes.anon.EnableMultipleScopes
import typingsJapgolly.commitlintTypes.anon.PartialRecordPromptNamede
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPromptMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ P in keyof T ]:? {[ K in keyof T[P] ]:? T[P][K]}}
    }}}
    */
  @js.native
  trait DeepPartial[T] extends StObject
  
  trait PromptConfig extends StObject {
    
    var messages: PromptMessages
    
    var questions: PartialRecordPromptNamede
    
    var settings: EnableMultipleScopes
  }
  object PromptConfig {
    
    inline def apply(messages: PromptMessages, questions: PartialRecordPromptNamede, settings: EnableMultipleScopes): PromptConfig = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any], questions = questions.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptConfig]
    }
    
    extension [Self <: PromptConfig](x: Self) {
      
      inline def setMessages(value: PromptMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setQuestions(value: PartialRecordPromptNamede): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: EnableMultipleScopes): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromptMessages
    extends StObject
       with /* _key */ StringDictionary[String] {
    
    var emptyWarning: String
    
    var lowerLimitWarning: String
    
    var max: String
    
    var min: String
    
    var skip: String
    
    var upperLimitWarning: String
  }
  object PromptMessages {
    
    inline def apply(
      emptyWarning: String,
      lowerLimitWarning: String,
      max: String,
      min: String,
      skip: String,
      upperLimitWarning: String
    ): PromptMessages = {
      val __obj = js.Dynamic.literal(emptyWarning = emptyWarning.asInstanceOf[js.Any], lowerLimitWarning = lowerLimitWarning.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any], upperLimitWarning = upperLimitWarning.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromptMessages]
    }
    
    extension [Self <: PromptMessages](x: Self) {
      
      inline def setEmptyWarning(value: String): Self = StObject.set(x, "emptyWarning", value.asInstanceOf[js.Any])
      
      inline def setLowerLimitWarning(value: String): Self = StObject.set(x, "lowerLimitWarning", value.asInstanceOf[js.Any])
      
      inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: String): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
      
      inline def setUpperLimitWarning(value: String): Self = StObject.set(x, "upperLimitWarning", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.isBreaking
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.breakingBody
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.breaking
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.isIssueAffected
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.issuesBody
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.issues
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.header
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type`
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.scope
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.subject
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.body
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.footer
  */
  trait PromptName extends StObject
  object PromptName {
    
    inline def body: typingsJapgolly.commitlintTypes.commitlintTypesStrings.body = "body".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.body]
    
    inline def breaking: typingsJapgolly.commitlintTypes.commitlintTypesStrings.breaking = "breaking".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.breaking]
    
    inline def breakingBody: typingsJapgolly.commitlintTypes.commitlintTypesStrings.breakingBody = "breakingBody".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.breakingBody]
    
    inline def footer: typingsJapgolly.commitlintTypes.commitlintTypesStrings.footer = "footer".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.footer]
    
    inline def header: typingsJapgolly.commitlintTypes.commitlintTypesStrings.header = "header".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.header]
    
    inline def isBreaking: typingsJapgolly.commitlintTypes.commitlintTypesStrings.isBreaking = "isBreaking".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.isBreaking]
    
    inline def isIssueAffected: typingsJapgolly.commitlintTypes.commitlintTypesStrings.isIssueAffected = "isIssueAffected".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.isIssueAffected]
    
    inline def issues: typingsJapgolly.commitlintTypes.commitlintTypesStrings.issues = "issues".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.issues]
    
    inline def issuesBody: typingsJapgolly.commitlintTypes.commitlintTypesStrings.issuesBody = "issuesBody".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.issuesBody]
    
    inline def scope: typingsJapgolly.commitlintTypes.commitlintTypesStrings.scope = "scope".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.scope]
    
    inline def subject: typingsJapgolly.commitlintTypes.commitlintTypesStrings.subject = "subject".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.subject]
    
    inline def `type`: typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type` = "type".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.header
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type`
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.scope
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.subject
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.body
    - typingsJapgolly.commitlintTypes.commitlintTypesStrings.footer
  */
  trait RuleField extends StObject
  object RuleField {
    
    inline def body: typingsJapgolly.commitlintTypes.commitlintTypesStrings.body = "body".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.body]
    
    inline def footer: typingsJapgolly.commitlintTypes.commitlintTypesStrings.footer = "footer".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.footer]
    
    inline def header: typingsJapgolly.commitlintTypes.commitlintTypesStrings.header = "header".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.header]
    
    inline def scope: typingsJapgolly.commitlintTypes.commitlintTypesStrings.scope = "scope".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.scope]
    
    inline def subject: typingsJapgolly.commitlintTypes.commitlintTypesStrings.subject = "subject".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.subject]
    
    inline def `type`: typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type` = "type".asInstanceOf[typingsJapgolly.commitlintTypes.commitlintTypesStrings.`type`]
  }
  
  /* Inlined @commitlint/types.@commitlint/types/lib/prompt.DeepPartial<@commitlint/types.@commitlint/types/lib/prompt.PromptConfig> */
  trait UserPromptConfig extends StObject {
    
    var messages: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? @commitlint/types.@commitlint/types/lib/prompt.PromptMessages[K]} */ js.Any
      ] = js.undefined
    
    var questions: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? / * Inlined std.Partial<std.Record<@commitlint/types.@commitlint/types/lib/prompt.PromptName, {  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined}>> * /
    {  isBreaking :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   issuesBody :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   breakingBody :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   issues :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   header :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   scope :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   isIssueAffected :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   body :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   subject :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   breaking :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   type :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   footer :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined}[K]} */ js.Any
      ] = js.undefined
    
    var settings: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? {  scopeEnumSeparator :string,   enableMultipleScopes :boolean}[K]} */ js.Any
      ] = js.undefined
  }
  object UserPromptConfig {
    
    inline def apply(): UserPromptConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UserPromptConfig]
    }
    
    extension [Self <: UserPromptConfig](x: Self) {
      
      inline def setMessages(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? @commitlint/types.@commitlint/types/lib/prompt.PromptMessages[K]} */ js.Any
      ): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setQuestions(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? / * Inlined std.Partial<std.Record<@commitlint/types.@commitlint/types/lib/prompt.PromptName, {  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined}>> * /
      {  isBreaking :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   issuesBody :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   breakingBody :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   issues :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   header :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   scope :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   isIssueAffected :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   body :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   subject :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   breaking :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   type :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined,   footer :{  description :string | undefined,   messages :{[K: string] : string} | undefined,   enum :{[enumName: string] : {  description :string | undefined,   title :string | undefined,   emoji :string | undefined}} | undefined} | undefined}[K]} */ js.Any
      ): Self = StObject.set(x, "questions", value.asInstanceOf[js.Any])
      
      inline def setQuestionsUndefined: Self = StObject.set(x, "questions", js.undefined)
      
      inline def setSettings(
        value: /* import warning: importer.ImportType#apply Failed type conversion: {[ K in any | undefined ]:? {  scopeEnumSeparator :string,   enableMultipleScopes :boolean}[K]} */ js.Any
      ): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    }
  }
}
