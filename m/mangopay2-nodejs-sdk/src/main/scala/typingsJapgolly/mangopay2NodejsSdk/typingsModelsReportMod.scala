package typingsJapgolly.mangopay2NodejsSdk

import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CSV
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Id_
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.TRANSACTION
import typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WALLET
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsEntityBaseMod.entityBase.EntityBaseData
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionNature
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionStatus
import typingsJapgolly.mangopay2NodejsSdk.typingsModelsTransactionMod.transaction.TransactionType
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.CurrencyISO
import typingsJapgolly.mangopay2NodejsSdk.typingsTypesMod.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typingsModelsReportMod {
  
  object report {
    
    /* Rewritten from type alias, can be one of: 
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Alias
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AuthorId
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankAccountId
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankWireRef
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardId
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardType
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Country
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreationDate
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsAmount
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsCurrency
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedUserId
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedWalletId
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Culture
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsAmount
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsCurrency
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedWalletId
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsAmount
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsCurrency
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesAmount
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesCurrency
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionDate
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionType
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExpirationDate
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesAmount
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesCurrency
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Id_
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Nature
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PaymentType
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PreauthorizationId
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultCode
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultMessage
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Status
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Tag
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type
      - typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WireReference
    */
    trait Column extends StObject
    object Column {
      
      inline def Alias: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Alias = "Alias".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Alias]
      
      inline def AuthorId: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AuthorId = "AuthorId".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.AuthorId]
      
      inline def BankAccountId: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankAccountId = "BankAccountId".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankAccountId]
      
      inline def BankWireRef: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankWireRef = "BankWireRef".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.BankWireRef]
      
      inline def CardId: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardId = "CardId".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardId]
      
      inline def CardType: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardType = "CardType".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CardType]
      
      inline def Country: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Country = "Country".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Country]
      
      inline def CreationDate: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreationDate = "CreationDate".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreationDate]
      
      inline def CreditedFundsAmount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsAmount = "CreditedFundsAmount".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsAmount]
      
      inline def CreditedFundsCurrency: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsCurrency = "CreditedFundsCurrency".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedFundsCurrency]
      
      inline def CreditedUserId: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedUserId = "CreditedUserId".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedUserId]
      
      inline def CreditedWalletId: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedWalletId = "CreditedWalletId".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.CreditedWalletId]
      
      inline def Culture: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Culture = "Culture".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Culture]
      
      inline def DebitedFundsAmount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsAmount = "DebitedFundsAmount".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsAmount]
      
      inline def DebitedFundsCurrency: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsCurrency = "DebitedFundsCurrency".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedFundsCurrency]
      
      inline def DebitedWalletId: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedWalletId = "DebitedWalletId".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DebitedWalletId]
      
      inline def DeclaredDebitedFundsAmount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsAmount = "DeclaredDebitedFundsAmount".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsAmount]
      
      inline def DeclaredDebitedFundsCurrency: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsCurrency = "DeclaredDebitedFundsCurrency".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredDebitedFundsCurrency]
      
      inline def DeclaredFeesAmount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesAmount = "DeclaredFeesAmount".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesAmount]
      
      inline def DeclaredFeesCurrency: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesCurrency = "DeclaredFeesCurrency".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.DeclaredFeesCurrency]
      
      inline def ExecutionDate: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionDate = "ExecutionDate".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionDate]
      
      inline def ExecutionType: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionType = "ExecutionType".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExecutionType]
      
      inline def ExpirationDate: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExpirationDate = "ExpirationDate".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ExpirationDate]
      
      inline def FeesAmount: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesAmount = "FeesAmount".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesAmount]
      
      inline def FeesCurrency: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesCurrency = "FeesCurrency".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.FeesCurrency]
      
      inline def Id: Id_ = "Id".asInstanceOf[Id_]
      
      inline def Nature: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Nature = "Nature".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Nature]
      
      inline def PaymentType: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PaymentType = "PaymentType".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PaymentType]
      
      inline def PreauthorizationId: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PreauthorizationId = "PreauthorizationId".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.PreauthorizationId]
      
      inline def ResultCode: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultCode = "ResultCode".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultCode]
      
      inline def ResultMessage: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultMessage = "ResultMessage".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.ResultMessage]
      
      inline def Status: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Status = "Status".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Status]
      
      inline def Tag: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Tag = "Tag".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Tag]
      
      inline def Type: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type = "Type".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.Type]
      
      inline def WireReference: typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WireReference = "WireReference".asInstanceOf[typingsJapgolly.mangopay2NodejsSdk.mangopay2NodejsSdkStrings.WireReference]
    }
    
    /* Inlined parent mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/types.PickPartial<mangopay2-nodejs-sdk.mangopay2-nodejs-sdk/typings/models/report.report.ReportData, 'Tag' | 'CallbackURL' | 'DownloadFormat' | 'Sort' | 'Preview' | 'Filters' | 'Columns' | 'ReportType'> */
    trait CreateReport extends StObject {
      
      var CallbackURL: js.UndefOr[String] = js.undefined
      
      var Columns: js.UndefOr[js.Array[Column]] = js.undefined
      
      var DownloadFormat: js.UndefOr[CSV] = js.undefined
      
      var Filters: js.UndefOr[typingsJapgolly.mangopay2NodejsSdk.typingsModelsReportMod.report.Filters] = js.undefined
      
      var Preview: js.UndefOr[Boolean] = js.undefined
      
      var ReportType: js.UndefOr[TRANSACTION | WALLET] = js.undefined
      
      var Sort: js.UndefOr[String] = js.undefined
      
      var Tag: js.UndefOr[String] = js.undefined
    }
    object CreateReport {
      
      inline def apply(): CreateReport = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[CreateReport]
      }
      
      extension [Self <: CreateReport](x: Self) {
        
        inline def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
        
        inline def setCallbackURLUndefined: Self = StObject.set(x, "CallbackURL", js.undefined)
        
        inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsUndefined: Self = StObject.set(x, "Columns", js.undefined)
        
        inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value*))
        
        inline def setDownloadFormat(value: CSV): Self = StObject.set(x, "DownloadFormat", value.asInstanceOf[js.Any])
        
        inline def setDownloadFormatUndefined: Self = StObject.set(x, "DownloadFormat", js.undefined)
        
        inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
        
        inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
        
        inline def setPreview(value: Boolean): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
        
        inline def setPreviewUndefined: Self = StObject.set(x, "Preview", js.undefined)
        
        inline def setReportType(value: TRANSACTION | WALLET): Self = StObject.set(x, "ReportType", value.asInstanceOf[js.Any])
        
        inline def setReportTypeUndefined: Self = StObject.set(x, "ReportType", js.undefined)
        
        inline def setSort(value: String): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
        
        inline def setSortUndefined: Self = StObject.set(x, "Sort", js.undefined)
        
        inline def setTag(value: String): Self = StObject.set(x, "Tag", value.asInstanceOf[js.Any])
        
        inline def setTagUndefined: Self = StObject.set(x, "Tag", js.undefined)
      }
    }
    
    trait Filters extends StObject {
      
      /**
        * To return only resources that have CreationDate AFTER this date
        */
      var AfterDate: Timestamp
      
      /**
        * A user's ID
        */
      var AuthorId: String
      
      /**
        * To return only resources that have CreationDate BEFORE this date
        */
      var BeforeDate: Timestamp
      
      /**
        * The maximum amount of DebitedFunds
        */
      var MaxDebitedFundsAmount: Double
      
      /**
        * The currency for the maximum amount of DebitedFunds
        */
      var MaxDebitedFundsCurrency: CurrencyISO
      
      /**
        * The maximum amount of Fees
        */
      var MaxFeesAmount: Double
      
      /**
        * The currency for the maximum amount of Fees
        */
      var MaxFeesCurrency: CurrencyISO
      
      /**
        * The minimum amount of DebitedFunds
        */
      var MinDebitedFundsAmount: Double
      
      /**
        * The currency for the minimum amount of DebitedFunds
        */
      var MinDebitedFundsCurrency: CurrencyISO
      
      /**
        * The minimum amount of Fees
        */
      var MinFeesAmount: Double
      
      /**
        * The currency for the minimum amount of Fees
        */
      var MinFeesCurrency: CurrencyISO
      
      /**
        * The nature of the transaction
        */
      var Nature: js.Array[TransactionNature]
      
      /**
        * The status of the transaction
        */
      var Status: js.Array[TransactionStatus]
      
      /**
        * The type of the transaction
        */
      var Type: js.Array[TransactionType]
      
      /**
        * The ID of a wallet
        */
      var WalletId: String
    }
    object Filters {
      
      extension [Self <: Filters](x: Self) {
        
        inline def setAfterDate(value: Timestamp): Self = StObject.set(x, "AfterDate", value.asInstanceOf[js.Any])
        
        inline def setAuthorId(value: String): Self = StObject.set(x, "AuthorId", value.asInstanceOf[js.Any])
        
        inline def setBeforeDate(value: Timestamp): Self = StObject.set(x, "BeforeDate", value.asInstanceOf[js.Any])
        
        inline def setMaxDebitedFundsAmount(value: Double): Self = StObject.set(x, "MaxDebitedFundsAmount", value.asInstanceOf[js.Any])
        
        inline def setMaxDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxDebitedFundsCurrency", value.asInstanceOf[js.Any])
        
        inline def setMaxFeesAmount(value: Double): Self = StObject.set(x, "MaxFeesAmount", value.asInstanceOf[js.Any])
        
        inline def setMaxFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MaxFeesCurrency", value.asInstanceOf[js.Any])
        
        inline def setMinDebitedFundsAmount(value: Double): Self = StObject.set(x, "MinDebitedFundsAmount", value.asInstanceOf[js.Any])
        
        inline def setMinDebitedFundsCurrency(value: CurrencyISO): Self = StObject.set(x, "MinDebitedFundsCurrency", value.asInstanceOf[js.Any])
        
        inline def setMinFeesAmount(value: Double): Self = StObject.set(x, "MinFeesAmount", value.asInstanceOf[js.Any])
        
        inline def setMinFeesCurrency(value: CurrencyISO): Self = StObject.set(x, "MinFeesCurrency", value.asInstanceOf[js.Any])
        
        inline def setNature(value: js.Array[TransactionNature]): Self = StObject.set(x, "Nature", value.asInstanceOf[js.Any])
        
        inline def setNatureVarargs(value: TransactionNature*): Self = StObject.set(x, "Nature", js.Array(value*))
        
        inline def setStatus(value: js.Array[TransactionStatus]): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
        
        inline def setStatusVarargs(value: TransactionStatus*): Self = StObject.set(x, "Status", js.Array(value*))
        
        inline def setType(value: js.Array[TransactionType]): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
        
        inline def setTypeVarargs(value: TransactionType*): Self = StObject.set(x, "Type", js.Array(value*))
        
        inline def setWalletId(value: String): Self = StObject.set(x, "WalletId", value.asInstanceOf[js.Any])
      }
    }
    
    trait ReportData
      extends StObject
         with EntityBaseData {
      
      /**
        * A URL that we will ping when the report is ready to download(works in a similar way to the hooks)
        */
      var CallbackURL: String
      
      /**
        * A list of columns / infos to show in the report
        */
      var Columns: js.Array[Column]
      
      /**
        * The format of the report download
        */
      var DownloadFormat: CSV
      
      /**
        * The URL to download the report
        */
      var DownloadURL: String
      
      /**
        * An object of various filters for the report
        */
      var Filters: typingsJapgolly.mangopay2NodejsSdk.typingsModelsReportMod.report.Filters
      
      /**
        * Whether the report should be limited to the first 10 lines(and therefore quicker to execute)
        */
      var Preview: Boolean
      
      /**
        * The date when the report was executed
        */
      var ReportDate: Timestamp
      
      /**
        * The type of report
        */
      var ReportType: TRANSACTION | WALLET
      
      /**
        * The result code
        */
      var ResultCode: String
      
      /**
        * A verbal explanation of the ResultCode
        */
      var ResultMessage: String
      
      /**
        * The column to sort against and direction separated by a `:`
        */
      var Sort: String
    }
    object ReportData {
      
      inline def apply(
        CallbackURL: String,
        Columns: js.Array[Column],
        CreationDate: Double,
        DownloadURL: String,
        Filters: Filters,
        Id: String,
        Preview: Boolean,
        ReportDate: Timestamp,
        ReportType: TRANSACTION | WALLET,
        ResultCode: String,
        ResultMessage: String,
        Sort: String,
        Tag: String
      ): ReportData = {
        val __obj = js.Dynamic.literal(CallbackURL = CallbackURL.asInstanceOf[js.Any], Columns = Columns.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], DownloadFormat = "CSV", DownloadURL = DownloadURL.asInstanceOf[js.Any], Filters = Filters.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Preview = Preview.asInstanceOf[js.Any], ReportDate = ReportDate.asInstanceOf[js.Any], ReportType = ReportType.asInstanceOf[js.Any], ResultCode = ResultCode.asInstanceOf[js.Any], ResultMessage = ResultMessage.asInstanceOf[js.Any], Sort = Sort.asInstanceOf[js.Any], Tag = Tag.asInstanceOf[js.Any])
        __obj.asInstanceOf[ReportData]
      }
      
      extension [Self <: ReportData](x: Self) {
        
        inline def setCallbackURL(value: String): Self = StObject.set(x, "CallbackURL", value.asInstanceOf[js.Any])
        
        inline def setColumns(value: js.Array[Column]): Self = StObject.set(x, "Columns", value.asInstanceOf[js.Any])
        
        inline def setColumnsVarargs(value: Column*): Self = StObject.set(x, "Columns", js.Array(value*))
        
        inline def setDownloadFormat(value: CSV): Self = StObject.set(x, "DownloadFormat", value.asInstanceOf[js.Any])
        
        inline def setDownloadURL(value: String): Self = StObject.set(x, "DownloadURL", value.asInstanceOf[js.Any])
        
        inline def setFilters(value: Filters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
        
        inline def setPreview(value: Boolean): Self = StObject.set(x, "Preview", value.asInstanceOf[js.Any])
        
        inline def setReportDate(value: Timestamp): Self = StObject.set(x, "ReportDate", value.asInstanceOf[js.Any])
        
        inline def setReportType(value: TRANSACTION | WALLET): Self = StObject.set(x, "ReportType", value.asInstanceOf[js.Any])
        
        inline def setResultCode(value: String): Self = StObject.set(x, "ResultCode", value.asInstanceOf[js.Any])
        
        inline def setResultMessage(value: String): Self = StObject.set(x, "ResultMessage", value.asInstanceOf[js.Any])
        
        inline def setSort(value: String): Self = StObject.set(x, "Sort", value.asInstanceOf[js.Any])
      }
    }
  }
}
